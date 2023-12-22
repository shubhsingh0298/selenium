package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParentWindow {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/login/");
		
	//	String url=driver.getCurrentUrl();
		
		/*
		 if(url.contains("facebook"))
		{
			System.out.println("Pass: the url has been verified");
		}
		else
			System.out.println("Fail:the url has not been verified");
			*/
	    driver.get("https://demo.actitime.com/login.do"); 
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		//close the tab
		Thread.sleep(5000);
		driver.close();

	}

}