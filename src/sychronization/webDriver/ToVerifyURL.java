package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String Url= driver.getCurrentUrl();
		
		if(Url.contains("facebook"))
		{
			System.out.println("Pass:the Url has been verified");
		}
		else
		{
			System.out.println("Fail:the Url has not been verified");
		}
	}
	
}
