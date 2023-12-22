package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		//WebElement textField = driver.findElement(By.name("q"));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.name("q")).sendKeys("java");  
		
	}
}
