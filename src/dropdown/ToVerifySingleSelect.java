package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySingleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Nav the url
		driver.get("https://www.facebook.com/");
		
		//clicking on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//Identifying the month dropdown
		WebElement monthElement = driver.findElement(By.id("month"));
		
		//selecting Sep month
		Select select = new Select(monthElement);
		boolean multiple = select.isMultiple();
		
		if(multiple) {
			System.out.println("The dropdown is multiselect");
			
			
		}
		else
			System.out.println("The dropdown is singleselect");
		

	}

}
