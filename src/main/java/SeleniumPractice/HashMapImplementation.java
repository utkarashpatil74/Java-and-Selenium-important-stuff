package SeleniumPractice;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-email")).sendKeys(supplyUsernameValues("research"));
		driver.findElement(By.id("input-password")).sendKeys(supplyPasswordValues("research"));
		assertEquals(driver.findElement(By.id("input-email")).getAttribute("value"),supplyUsernameValues("research"));
		assertEquals(driver.findElement(By.id("input-password")).getAttribute("value"),supplyPasswordValues("research"));

	}
	
	
	public static HashMap<String,String> getUserCredentials() {
		
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("research","Utkarsh:Utkarsh@123!");
		map.put("OCP Provider","Vaibhav:Vaibhav@123!");
		map.put("OCP admin user","Bhagyashree:bhagya@123!");
		
		
		return map;
	}
	
	public static String supplyUsernameValues(String user) {
		
		if(!getUserCredentials().containsKey(user)) {
			
			return "Please pass the valid user";
		}
		
		String[] s=getUserCredentials().get(user).split(":");
		
		return s[0];
		
	}
	
public static String supplyPasswordValues(String user) {
		
		if(!getUserCredentials().containsKey(user)) {
			
			return "Please pass the valid user";
		}
		
		String[] s=getUserCredentials().get(user).split(":");
		
		return s[1];
		
	}

}
