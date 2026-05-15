import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapgeminiPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		List<WebElement>ls=driver.findElements(By.tagName("a"));
		
		List<String> url=new ArrayList<>();
		
		for(WebElement e:ls) {
			
			String s=e.getText();
			url.add(s);
		}
		
		for(String s:url) {
			getBrokenLinks(s);
		}
		
		

	}
	
	
	public static void getBrokenLinks(String url2) throws IOException {
		
		URL url=new URL(url2);
		
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		
		con.setConnectTimeout(5000);
		
		con.connect();
		
		if(con.getResponseCode()>=400) {
			
			System.out.println(url+" is broken "+con.getResponseCode());
		}
		else {
			System.out.println(url+" is ok ");
		}
		
	}
	
}
