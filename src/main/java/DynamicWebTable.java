import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println("Number of rows "+rows.size());
		
		for(int i=1;i<=rows.size();i++) {
			
			
			String name=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]")).getText();
			
			if(name.equals("Chrome")) {
				
				String actLoad=driver.findElement(By.xpath("//table//tbody//tr["+i+"]/td[1]/following-sibling::td[contains(text(),'%')]")).getText();
				
				String expLoad=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
				
				if(expLoad.contains(actLoad)) {
					System.out.println("CPU loads are matched "+actLoad+" "+expLoad);
				}
				else {
					System.out.println("CPU loads are unmatched");
				}
				break;
			}
			
			
			
		}
		
		

	}

}
