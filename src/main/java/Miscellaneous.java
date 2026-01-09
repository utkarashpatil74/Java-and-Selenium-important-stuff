import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		WebElement submitButton=driver.findElement(By.cssSelector("input[value='Submit']"));
		
		WebElement fullName=driver.findElement(By.id("fullname"));
		
		Actions acts = new Actions(driver);
		
		acts.click(fullName).keyDown(Keys.SHIFT).sendKeys("utkarsh").keyUp(Keys.SHIFT).perform();
		acts.click(driver.findElement(By.id("email"))).keyDown(Keys.SHIFT).sendKeys("utkarshpatil26@gmail.com").keyUp(Keys.SHIFT).perform();
		acts.click(driver.findElement(By.id("address"))).sendKeys("124 kt nagar").perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",submitButton);
		


	}

}
