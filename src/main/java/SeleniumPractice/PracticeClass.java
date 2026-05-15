package SeleniumPractice;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(getUsername("OCP Provider"));
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(driver.findElement(By.id("input-email")).getAttribute("value"), "Utkarsh2");
		driver.findElement(By.id("input-password")).sendKeys(getPassword("OCP Provider"));
		
		sa.assertEquals(driver.findElement(By.id("input-password")).getAttribute("value"),"Utkarsh@123!1");
		
		sa.assertAll();
	}
	
	
	public static HashMap userCreds() {
		
		HashMap<String,String> hmap=new HashMap<>();
		
		hmap.put("OCP Provider","Utkarsh:Utkarsh@123!");
		hmap.put("OCP Research","Vaibhav:Vaibhav@123!");
		hmap.put("OCP Admin","Bhagya:Bhagya@123!");
		
		return hmap;
		
	}
	
	public static String getUsername(String user) {
		
		String name=userCreds().get(user).toString().split(":")[0];
		
		return name;
	}
	
	public static String getPassword(String user) {
		String password=userCreds().get(user).toString().split(":")[1];
		
		return password;
		
	}
	
	

}
