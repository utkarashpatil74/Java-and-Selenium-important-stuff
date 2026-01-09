import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {
	
//	@Test(dataProvider ="NaveenAutomation", dataProviderClass = ReadFromXcel.class)
//	public void testRegister(String fname, String lname, String telephone, String password, String subscribe) {
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
//		driver.findElement(By.id("firstname")).sendKeys(fname);
//		driver.findElement(By.id("lastname")).sendKeys(lname);
//		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
//		driver.findElement(By.id("input-password")).sendKeys(password);
		
		
//}
	
	@Test(dataProvider="tutorialsPoint", priority = 1, dataProviderClass =ReadFromExcelSheet2.class)
	public void test2(String fname, String lname,String telephone, String password, String subscribe) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		driver.findElement(By.id("firstname")).sendKeys(fname);
		driver.findElement(By.id("lastname")).sendKeys(lname);
	}

}
