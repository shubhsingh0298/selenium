package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollToVisibleArea {

	public static void main(String[] args) {


		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the URL
		driver.get("https://www.selenium.dev/");
		
		WebElement readmoreButton = driver.findElement(By.xpath("//a[@href='/documentation/webdriver/']"));

		//If true the element will come to the top of the page and if false it will come to the bottom of the page
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", readmoreButton);
	}

}
