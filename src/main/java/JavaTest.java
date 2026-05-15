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

public class JavaTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
	
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		List<String> li=new ArrayList<>();
		
		for(WebElement e:allLinks) {
			
			li.add(e.getAttribute("href"));
		}
		
//		for(String f:li) {
//			try {
//				getBrokenLinks(f);
//			} catch (MalformedURLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//		}
		
		li.parallelStream().forEach(a -> {
			try {
				getBrokenLinks(a);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		

	}
	
	public static void getBrokenLinks(String url3) throws IOException {
		
		try {
		if(url3==null || url3.isEmpty()) {
			return;
		}
		
		if(!(url3.startsWith("http")|| url3.startsWith("https"))) {
			return;
		}
		
		URL url=new URL(url3);
		
		
		
			HttpURLConnection url2= (HttpURLConnection)url.openConnection();
			url2.setConnectTimeout(500);
			url2.connect();
			
			if(url2.getResponseCode()>=400) {
				System.out.println(url3+" is a broken url "+url2.getResponseMessage());
			}
			else {
				System.out.println(url3+" is OK "+url2.getResponseMessage());
			}
		}
			
			catch(Exception e) {
				e.printStackTrace();
			}
			
		} 

	
	
	

}
