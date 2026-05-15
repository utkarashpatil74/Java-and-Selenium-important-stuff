import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowHandlesPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='Our Blog']")).click();
		driver.findElement(By.xpath("//div[text()='Help Center']")).click();
		driver.findElement(By.xpath("//div[text()='Sell on Snapdeal']")).click();
		
		Set<String> ids=driver.getWindowHandles();
		
		for(String s:ids) {
			
			driver.switchTo().window(s);
			
			if(driver.getTitle().equals("Seller Onboarding")) {
				
				Assert.assertEquals(driver.getCurrentUrl(),"https://setu.snapdeal.com/");
				break;
			}
			
			
		}

	}

}
