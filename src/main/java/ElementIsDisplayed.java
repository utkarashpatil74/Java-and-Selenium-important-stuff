import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ElementIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(Exception.class);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("displayed-text")));
		
		WebElement elementDisplayed=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("displayed-text"))));
		
		assertTrue(elementDisplayed.isDisplayed(),"Element is not displayed");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("hide-textbox")).click();
		
		Boolean elementNotDisplayed=wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("displayed-text"))));
		
		assertTrue(elementNotDisplayed,"Element is not displayed");

	
	}

}
