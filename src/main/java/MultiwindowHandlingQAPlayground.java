import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultiwindowHandlingQAPlayground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.qaplayground.com/practice/window");
		
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		
		String currentWindow=driver.getWindowHandle();
		Set<String> tabs=driver.getWindowHandles();
		
		
		try {
			
			for(String a:tabs) {
				driver.switchTo().window(a);
				
				System.out.println(driver.getTitle());
				
				
				String url=driver.getCurrentUrl();
				
				if(url.equals("https://www.qaplayground.com/")) {
					
					 System.out.println(driver.getTitle());
					Boolean s= driver.findElement(By.xpath("//button[text()='Get Started']")).isDisplayed();
					Assert.assertTrue(s);
					driver.close();
					
					driver.switchTo().window(currentWindow);
					Assert.assertEquals(driver.getCurrentUrl(), "https://www.qaplayground.com/practice/window");
					
				
					
				}
				
				
				
				
			}
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
			
	
	}


}