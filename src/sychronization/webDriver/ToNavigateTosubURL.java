package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateTosubURL {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.google.co.in/");
	    
	    URL url=new URL("https://www.facebook.com/");
	    driver.navigate().to(url);
	    
		

	}

}
