import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		//Get the city name for Dwayne
		
		List<WebElement> rows=driver.findElements(By.xpath("(//table[@id='product'])[2]//tbody/tr"));
		
		System.out.println("Number of rows "+rows.size());
		
		
		List<WebElement> names=driver.findElements(By.xpath("(//table[@id='product'])[2]//tbody/tr/td[1]"));
		
		for(WebElement e:names) {
			
			String name=e.getText();
			System.out.println(name);
			if(name.equals("Dwayne")) {
				
				String city=driver.findElement(By.xpath("(//table[@id='product'])[2]//tbody/tr/td[1]/following-sibling::td[2]")).getText();
				
				System.out.println(city);
				Assert.assertEquals(city,"Kolkata");
			}
			else {
				System.out.println("Dwayne's city is incorrect");
			}
			 
		}
	}

}
