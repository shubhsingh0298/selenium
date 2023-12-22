package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args)  {
		
		//Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		//Identifying the day dropdown
	WebElement dayElement = driver.findElement(By.id("day"));
	//selecting 2nd day
	Select select = new Select(dayElement);
	select.selectByIndex(1);
	//Indentifying the month dropdown
   WebElement monthElement = driver.findElement(By.id("month"));
	//selecting Sep month
	Select select1 = new Select(monthElement);
	select1.selectByVisibleText("Sep");
	//Identifying the Year dropdown
  WebElement yearElement = driver.findElement(By.id("year"));
	//selecting 1998 year
	Select select2 = new Select(yearElement);
	select2.selectByVisibleText("1998");
		
		
		

	}

}
