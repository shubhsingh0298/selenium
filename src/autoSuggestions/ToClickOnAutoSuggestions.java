package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to the URL
				driver.get("https://www.google.com/");
				
				//Identifying the google text box and passing the text
				driver.findElement(By.name("q")).sendKeys("Bhai jaan");
				Thread.sleep(2000);
				
				//Finding all autosuggestions
				List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(text(), 'hai')]"));
				
				for(WebElement suggestion:autoSuggestions) {
					if(suggestion.getText().contains("shyari")) {
						suggestion.click();
					}
					
				}
						

	}

}
