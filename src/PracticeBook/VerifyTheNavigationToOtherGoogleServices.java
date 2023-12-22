package PracticeBook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyTheNavigationToOtherGoogleServices {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the url
		driver.get("https://www.google.com");
		//WebElement popUp = driver.findElement(By.xpath("//button[text()='No thanks']"));
		 //  popUp.click();
		
		//Click on the app icon in the top right corner
	   WebElement appIcon = driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products?tab=rh\']"));
	  
	   appIcon.click();
	   driver.findElement(By.xpath("//iframe[@role='presentation']"));
	   //Click on any google services app
	
	 
	 //Click option performing by actions class
	
}
}