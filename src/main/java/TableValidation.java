import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TableValidation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		
		List<String> expectedValues=new ArrayList<>();
		
		expectedValues.add("Login");
		expectedValues.add("Register");
		expectedValues.add("Forgotten Password");
		expectedValues.add("My Account");
		expectedValues.add("Address Book");
		expectedValues.add("Wish List");
		expectedValues.add("Order History");
		expectedValues.add("Downloads");
		expectedValues.add("Recurring payments");
		expectedValues.add("Reward Points");
		expectedValues.add("Returns");
		expectedValues.add("Transactions");
		expectedValues.add("Newsletter");
		
		
		List<WebElement> elements=driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		
		
		
		
		List<String> actualValues=new ArrayList<>();
		
		for(WebElement e:elements) {
			
			String s=e.getText();
			actualValues.add(s);
		}
		
		assertEquals(actualValues,expectedValues,"Values are mismatched");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='MP3 Players']"))).moveToElement(driver.findElement(By.xpath("//a[text()='test 11 (0)']"))).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	
		Set<String> windows=driver.getWindowHandles();
		
		for(String s:windows) {
			
			driver.switchTo().window(s);
			
			if(driver.getTitle().equals("test 11")) {
				
				System.out.println("We are on test 11 page");
				break;
				
			}
		}
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile=new File(System.getProperty("user.dir")+"//tutorials.png");
		
		FileHandler.copy(srcFile, destFile);
	}

}
