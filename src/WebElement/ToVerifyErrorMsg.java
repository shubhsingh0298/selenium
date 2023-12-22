package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsg {

	public static void main(String[] args) throws InterruptedException   {
		
		String expectedErrorMsg = "Username or Password is invalid. Please try again.";

	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.actitime.com/login.do");
	      
	      driver.findElement(By.xpath("//div[text()='Login ']")).click();
	      Thread.sleep(5000);
	      
	    String actualErrorMsg = driver.findElement(By.xpath("//span[@class=\"errormsg\"]")).getText();
	     
	      
		if(actualErrorMsg.contains(expectedErrorMsg)) {
			System.out.println("Pass: The error msg has been verified");
		}
		
		else
		{
			System.out.println("Fail:The error msg has not been verified");
		}
			
	    	  
	      
	}

}
