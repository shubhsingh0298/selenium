import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAlignmentIssue {

	public static void main(String[] args) {
	
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Nav to the url
		driver.get("file:///C:/Users/HP/Desktop/Shubham%20Automation/Automation.html");
		
		Point usernameTextFieldPos = driver.findElement(By.id("Qspiders")).getLocation();
		Point passwordTextFieldPos = driver.findElement(By.id("Jspiders")).getLocation();
		
		
		int xCoordinateOfUsername = usernameTextFieldPos.getX();
		int yCoordinateOfUsername = usernameTextFieldPos.getY();
		
		
		int xCoordinateOfPassword = passwordTextFieldPos.getX();
		int yCoordinateOfPassword = passwordTextFieldPos.getY();
		//Here if we take both coordinates x and y so result would always be fail.
	/*	if(xCoordinateOfUsername == xCoordinateOfPassword && yCoordinateOfPassword ==yCoordinateOfUsername)
		{
			System.out.println("Pass: The allignment is proper");
		}
		
		else 
			
			System.out.println("Fail: The allignment is not proper");
			*/
		//Here we have taken only one coordinate so it will verify the alignment correctly
		if(xCoordinateOfUsername == xCoordinateOfPassword) {
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
		driver.quit();

	}

}
