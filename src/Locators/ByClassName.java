package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Shubham%20Automation/Automation.html");
		
		driver.findElement(By.className("Selenium ")).click();

	}

}
