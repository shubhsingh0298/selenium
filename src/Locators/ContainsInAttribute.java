package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsInAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");

	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//Click will happen because functionality of click is not there on the webpage
	driver.findElement(By.xpath("//img[contains(@src, 'https://rukminim1.flixcart.com/fk-p-flap/128/128/image/0d')]")).click();
			
			

}

}
