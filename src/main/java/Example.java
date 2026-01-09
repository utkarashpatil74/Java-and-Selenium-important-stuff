import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> values=driver.findElements(By.xpath("(//table[@id='product'])[1]//tr//td[3]"));
		
		//int max=Integer.MIN_VALUE;
		int max=0;

		for(WebElement e:values) {

			int a=Integer.valueOf(e.getText());
			
			if(a>max) {
				max=a;
			}
			
			
		}
		System.out.println(max);
	

	}

}

