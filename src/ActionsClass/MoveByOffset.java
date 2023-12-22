package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the URL
		driver.get("https://www.myntra.com/");
		
		//Here i will use ACtions Class instead of findELements
		Actions action = new Actions(driver);
		action.moveByOffset(1300,40).click().perform(); ///here using without argument click() method
	}

}
