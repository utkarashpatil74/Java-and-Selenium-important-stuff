package Pattern;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	private WebDriver driver;
	@Test(dataProvider = "testData", dataProviderClass=XcelSheetDataProvider.class)
	void loginTest(String fname, String lname, String x,String y,String z) {
		driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("input-email")).sendKeys(fname);
		driver.findElement(By.id("input-password")).sendKeys(lname);
		
		
	}

}
