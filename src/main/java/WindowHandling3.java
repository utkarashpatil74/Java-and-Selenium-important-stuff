import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement e=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("openwindow"))));
		
		WebElement f=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("opentab"))));
		
		JavascriptExecutor js= (JavascriptExecutor)driver ;
		
		js.executeScript("arguments[0].click();", e);
		
		js.executeScript("arguments[0].click();", f);
		
		Set<String> handles=driver.getWindowHandles();
		
		for(String window:handles) {
			
			driver.switchTo().window(window);
			
			try {
			WebElement x=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Access all our Courses']"))));
				if(x.isDisplayed()==true) {
					System.out.println(driver.getCurrentUrl().equals("https://www.qaclickacademy.com/"));
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
				System.out.println("Driver is not in QA click academy");
			}
			finally {
				driver.quit();
			}
			
		}
		

	}

}
