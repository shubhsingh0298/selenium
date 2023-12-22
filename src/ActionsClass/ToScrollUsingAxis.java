package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollUsingAxis {

	public static void main(String[] args) {
		
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to the URL
				driver.get("https://www.selenium.dev/");
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,5000)"); //Using for page down
				js.executeScript("window.scrollTo(0,-500)"); //Using for page up


	}

}
