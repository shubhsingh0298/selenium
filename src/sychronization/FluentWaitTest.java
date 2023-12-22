package sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTest {

	public static void main(String[] args) {
		
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//For 4 version
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to the url
				driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
				
				driver.findElement(By.id("email")).sendKeys("shubhsingh0298@gmail.com");
				
				WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
				
				FluentWait wait = new FluentWait(driver);
				wait.withTimeout(Duration.ofSeconds(20));
				wait.pollingEvery(Duration.ofSeconds(100));
				wait.until(ExpectedConditions.elementToBeClickable(continueButton));
				wait.ignoring(NoSuchElementException.class);
				
				continueButton.click();
				

	}

}
