package PracticeBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {


		//Launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://www.facebook.com/");
		
		//Click on create new account 
		driver.findElement(By.linkText("Create new account")).click();
		
		//driver.findElement(By.className("fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-gte4 _19_u"));
		
	//	driver.findElement(By.name("firstname")).sendKeys("Shubham");
	//	WebElement mobileEmail = driver.findElement(By.xpath("//input[@type='text'  ]"));
	//	WebElement newpassword = driver.findElement(By.xpath("//input[@type='password'  ]"));
		
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByIndex(1);
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByValue("Sep");
		
		WebElement year = driver.findElement(By.id("1998"));
		
		driver.findElement(By.xpath("//*[@id=\"u_j_o_YN\"]/span[1]/label"));
				
		
		

	}

}
