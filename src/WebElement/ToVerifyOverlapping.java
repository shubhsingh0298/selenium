package WebElement;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlapping {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//nav to the url
		driver.get("file:///C:/Users/HP/Desktop/Shubham%20Automation/Automation.html");
		
		Rectangle usernameTextFieldRect = driver.findElement(By.id("Qspiders")).getRect();
		Rectangle passwordTextFieldRect = driver.findElement(By.id("Jspiders")).getRect();
		
		int yCoordinateOfUsername = usernameTextFieldRect.getY();
		int heightOfUsername = usernameTextFieldRect.getHeight();
		
		int endYOfUsername = yCoordinateOfUsername +heightOfUsername;
		
		int startYOfPassword = passwordTextFieldRect.getY();
		
		if(startYOfPassword>=endYOfUsername) {
			System.out.println("Pass: The textfields are not overlapping");
			
		}
		
		else
			System.out.println("Fail: The textfields are overlapping");
		
		driver.quit();
	}

}
