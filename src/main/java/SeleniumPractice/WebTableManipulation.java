package SeleniumPractice;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTableManipulation {

	
	@Test
	public void webtableManipulation() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//table[@id='product']/ancestor::div[@class='right-align']//table")));
		
		List<WebElement> ls=driver.findElements(By.xpath("//table[@id='product']/ancestor::div[@class='right-align']//table//td[4]"));
		
		long temp=0;
		
		for(WebElement e: ls) {
			long s=Integer.parseInt(e.getText());
			temp=temp+s;	
		}
		System.out.println(temp);
		
		//Max in the webtable
		
		long temp1=Integer.MIN_VALUE;
		
		for(WebElement e: ls) {
			long s=Integer.parseInt(e.getText());
			if(temp1<s) {
				temp1=s;
			}
		}
		
		System.out.println(temp1);
		
		
		SoftAssert as=new SoftAssert();
		as.assertEquals(temp,296);
		as.assertEquals(temp1,48);
		as.assertAll();
		
	}
	
	
	
}
