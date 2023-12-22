package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDrop {

	public static void main(String[] args) {
		
		//Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to the URL
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
				//Here we use source
				WebElement source1 = driver.findElement(By.id("box3"));
				
				//Here we create for  destination 
				WebElement destination1 = driver.findElement(By.id("box103"));
				
				//Now want to drag from source1 to destination1
				Actions action = new Actions(driver);
				action.dragAndDrop(source1, destination1).perform();
	}

}
