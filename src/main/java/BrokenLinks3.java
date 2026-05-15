import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks3 {

	
	
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		List<WebElement> rawLinks=driver.findElements(By.tagName("a"));
		
		List<String> links=new ArrayList<>();
		
		for(WebElement e:rawLinks) {
			String link=e.getAttribute("href");
			
			if(link.contains("http") || link.contains("https")) {
			links.add(link);
			}
			
		}
		
		System.out.println("Total links are "+links.size());
		
//		for(String s:links) {
//			
//			System.out.println(brokenLinks(s));
//		}
		
		links.parallelStream().forEach(e -> {
			try {
				brokenLinks(e);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}
	
	
	public static void brokenLinks(String link) throws IOException {
		
		try {
			
			URL url=new URL(link);
			HttpURLConnection connect=(HttpURLConnection)url.openConnection();
			connect.setConnectTimeout(5000);
			connect.connect();
			
			if(connect.getResponseCode()>=400) {
				System.out.println(link+ " is a broken link "+connect.getResponseMessage());
				
			}
			else {
				System.out.println(link+" is ok ");
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
