package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTagName {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/HP/Desktop/Shubham%20Automation/Automation.html");
		
	String tagName = driver.findElement(By.id("Qspiders")).getTagName();
	System.out.println(tagName);
		
		

	}

}
