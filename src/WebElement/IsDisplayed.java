package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/PipedreamHQ/pipedream/tree/master/components/github?gclid=Cj0KCQjwxMmhBhDJARIsANFGOStMN2CPzXeEkMdC_LT4wi-Dy6YENVm7LPeAEiutvhmeNwtX15h-n2kaAmh0EALw_wcB#github-api-integration-platform");

	Thread.sleep(5000);
	
  WebElement emailTextBox = driver.findElement(By.id("email"));
  
  
boolean displayed = emailTextBox.isDisplayed();

if(displayed)
{
	System.out.println("Pass: The element is dipalyed");
}
else
{
	System.out.println("Fail:The element is not displayed");
}
	
	
	
	}

}
