package PracticeBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifySearchFunctionality {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
		//Navigate to the url
		driver.get("https://www.google.com/");
		
		//Enter a search in the search box and click on the search button
	    WebElement textField = driver.findElement(By.name("q"));
	    WebElement searchButton = driver.findElement(By.name("btnK"));
	    
	    Actions action = new Actions(driver);
	    action.sendKeys(textField,"Hotstar").perform();
	  action.moveByOffset(0, 50).click(searchButton).perform();
	}

}
