package Pattern;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String s:windows) {
			
			driver.switchTo().window(s);
			
			if(driver.getCurrentUrl().contains("basic-controls.html")) {
				
				driver.manage().window().maximize();
				
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
				
				WebElement e=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstName"))));
				e.sendKeys("Utkarsh");
				
				WebElement f=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("lastName"))));
				f.sendKeys("Patil");
				
				break;
			}
		}
		
		System.out.println("Execution was successful");
		

	}

}
