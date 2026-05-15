package Pattern;

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
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		
		List<String> links=new ArrayList<>();
		
		for(WebElement e:ls) {
			String actualLink=e.getAttribute("href");
			links.add(actualLink);		
		}
		
		/*
		 * for(String s:links) { getBrokenLinks(s); }
		 */
		
		links.forEach(e -> {
			try {
				getBrokenLinks(e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
	

	}
	
	public static void getBrokenLinks(String links) throws IOException {
		
		URL url=new URL(links);
		HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
		urlConnection.setConnectTimeout(6000);
		urlConnection.connect();
		
		if(urlConnection.getResponseCode()>=400) {
			System.out.println(links+" is a broken link "+urlConnection.getResponseMessage());
		}	else {
				System.out.println(links+" is ok "+urlConnection.getResponseMessage());
			}
		}
		
	}


