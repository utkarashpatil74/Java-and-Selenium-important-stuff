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

public class Practice {

	public static void main(String[] args) {
		
		/*
		 * String s="Utkarsh Diwakar Patil".toLowerCase();
		 * 
		 * s=s.substring(0,7)+s.substring(7,15).toUpperCase()+s.substring(15,s.length())
		 * ;
		 * 
		 * System.out.println(s);
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		
		List<WebElement> rawUrl=driver.findElements(By.tagName("a"));
		
		List<String> ls=new ArrayList<>();
		
		for(WebElement e:rawUrl) {
			
			String s=e.getAttribute("href");
			ls.add(s);
			
		}
		
		ls.parallelStream().forEach(a -> {
			try {
				getBrokenUrl(a);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});;
		
		
	}
	
	public static void getBrokenUrl(String url) throws IOException {
		
		URL url2=new URL(url);
		
		HttpURLConnection httpConnect=(HttpURLConnection)url2.openConnection();
		
		httpConnect.setConnectTimeout(5000);
		httpConnect.connect();
		
		if(httpConnect.getResponseCode()>=400) {
			
			System.out.println(url+" is a broken url "+httpConnect.getResponseMessage());
			
		}
		else {
			System.out.println(url+" is fine "+httpConnect.getResponseMessage());
		}
	}
}
