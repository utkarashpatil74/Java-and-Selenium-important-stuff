import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		List<WebElement> salaries=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr//td[5]"));
		
		List<WebElement> names=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr//td[1]"));
		
		
		List<Map<String,Integer>> hmap=new ArrayList<>();
		
		for(WebElement e:names) {
			
			for(WebElement f:salaries) {
				if(names.indexOf(e)==salaries.indexOf(f)) {
					
					hmap.add(Map.of(e.getText(), Integer.parseInt(f.getText().replace("$", "").replace(",", ""))));
				}
					
				
			}
			
		}
		
			for(Map<String,Integer> m:hmap) {
				for(Entry<String, Integer> entry:m.entrySet()) {
					System.out.println("Name: "+entry.getKey()+" Salary: "+entry.getValue());
				}
			}
	}

	}

