import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	List<String> urls=new ArrayList<String>();
	
	for(WebElement link:links) {
		urls.add(link.getAttribute("href"));
		
	}
	
	System.out.println(urls.size());
	
//	urls.parallelStream().forEach(a -> {
//		try {
//			getBrokenLinks(a);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	});
	
	for(String s:urls) {
		try {
		getBrokenLinks(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		

	}
	
	public static void getBrokenLinks(String url2) throws IOException {
		URL url=new URL(url2);
		
		HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
		
		urlConnection.setConnectTimeout(500);
		urlConnection.connect();
		
		try {
		if(urlConnection.getResponseCode()>=400) {
			System.out.println("This link is broken "+urlConnection+urlConnection.getResponseMessage());
		}
		else {
			System.out.println("Link is OK "+urlConnection.getURL()+urlConnection.getResponseCode());
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
