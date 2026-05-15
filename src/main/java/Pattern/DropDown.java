package Pattern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	@Test
	void test() {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("dropdown-class-example"));
		
		
		Select sl=new Select(e);
		
		List<WebElement> ls=sl.getOptions();
		
		for(WebElement c:ls) {
			
			String x=c.getText();
			
			if(x.equals("Option3")) {
				
				c.click();
				break;
			}
			
		}
		
		
	}
}
