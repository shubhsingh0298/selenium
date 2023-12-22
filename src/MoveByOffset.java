import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigating to the URL
		driver.get("https://www.myntra.com/");
		
		//Here i will use Actions class only not using findElements
		Actions action=new Actions(driver);
		action.moveByOffset(1315,39).click().perform(); //Here I am using without argument clcik() method bcz i am not using findElements 
		
		
		
		

	}

}
