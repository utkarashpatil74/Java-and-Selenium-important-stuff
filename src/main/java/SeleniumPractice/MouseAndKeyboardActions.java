package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAndKeyboardActions {

	@Test
	public void mouseActions() {
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://practice.expandtesting.com/drag-and-drop");
	
	
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	
	WebElement draggable=driver.findElement(By.id("column-b"));
	
	WebElement droppable=driver.findElement(By.id("column-a"));
	
	
	act.clickAndHold(draggable).moveToElement(droppable).release(draggable).build().perform();
			
	
	
	
	}
}
