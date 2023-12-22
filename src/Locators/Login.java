package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.actitime.com/login.do");
      
      driver.findElement(By.id("username")).sendKeys("admin");
      driver.findElement(By.id("pwd")).sendKeys("manager");
      driver.findElement(By.xpath("//div[text()='Login ']")).click();
      

	}

}
