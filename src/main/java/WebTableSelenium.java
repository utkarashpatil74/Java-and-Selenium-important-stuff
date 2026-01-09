import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		List<WebElement> salaries=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr//td[5]"));
		
		Set<Integer> salary=new HashSet<>();
		
		for(WebElement e:salaries) {
			
			int sal=Integer.valueOf(e.getText());
			
			salary.add(sal);
		}
		
	Object[] s=	salary.toArray();
	
	Arrays.sort(s);
	
	System.out.println(s[s.length-2]);

	}

}
