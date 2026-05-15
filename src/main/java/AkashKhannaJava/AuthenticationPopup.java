package AkashKhannaJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v140.network.Network;
import org.openqa.selenium.devtools.v140.network.model.Headers;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {

	
	private static final String username = "admin";
	private static final String password = "admin";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		
		DevTools devTools=((EdgeDriver)driver).getDevTools();
		
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		//send auth headers
		
		Map<String,Object> headers=new HashMap<>();
		
		String basicAuth="Basic "+ new String(new Base64().encode(String.format("%s:%s",username,password).getBytes()));
		
		headers.put("Authorization", basicAuth);
		
		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//1) Using username and password directly in the url
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
