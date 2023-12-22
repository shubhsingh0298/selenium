package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAlignmentIssues {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Shubham%20Automation/Automation.html");
		
	      Point usernameTextFieldPos = driver.findElement(By.id("Qspiders")).getLocation();
	      Point passwordTextFieldPos = driver.findElement(By.id("Jspiders")).getLocation();
	      
	     int xCoordinateOfUsername = usernameTextFieldPos.getX();
	     int yCoordinateOfUsername = usernameTextFieldPos.getY();
	     
	     int xCoordinateOfPassword = passwordTextFieldPos.getX();
         int yCoordinateOfPassword = passwordTextFieldPos.getY();
	     
	     //if we take both the coordinates i.e x & y then it will give result as FAIL
	     
	 /*    if(xCoordinateOfUsername == xCoordinateOfPassword && yCoordinateOfPassword == yCoordinateOfUsername) {
	    	 System.out.println("Pass: The alignmnet is proper");
	     }
		
	     else
	    	 System.out.println("Fail: The alignment is not proper"); */
	     
	     //But if we take only only coordinate i.e, x or y then reslut will displayed as PASS
	     
	     if(xCoordinateOfUsername == xCoordinateOfPassword) {
	    	 System.out.println("Pass: The alignmnet is proper");
	     }
	     else
	    	 System.out.println("Fail: The alignment is not proper");
	    	 
	     driver.quit();
	}

}
