package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    
	    WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	     
	     checkbox.click();
	     
	     boolean selected = checkbox.isSelected();
	     
	     if(selected)
	     {
	    	 System.out.println("Pass: The checkbox is selected");
	     }
	     
	     else
	     {
	    	 System.out.println("Fail: The checkbox is not selected");
	     }
	}

}
