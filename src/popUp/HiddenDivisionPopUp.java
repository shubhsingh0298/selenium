package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		//Method 1 used for closing popup  by using xpath
	//	driver.findElement(By.xpath("//button[text()='X'")).click();
		
		
		//Method 2 used for closing popup by using actions class
		Actions action = new Actions(driver);
		action.moveByOffset(1300, 0).click().perform();

	}

}
