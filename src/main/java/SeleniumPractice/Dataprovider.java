package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider = "testData2", dataProviderClass = Dataprovider.class)
	public void testCase(String username,String password) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);

	}
	
	
	@DataProvider
	public Object[][] testData() {
		
		return new Object[][] {
			{"Utkarsh","Utkarsh@123!"},
			{"Vaibhav","Vaibhav@123!"}
			
		};
		
	}
	
	@DataProvider
	public Object[][] testData2() {
		
		return new Object[][] {
			{"Tom","Tom@123!"},
			{"Jerry","Jerry@123!"}
			
			
		};
		
	}

}
