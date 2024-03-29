package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopUp 
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.imacros.net/Automate/Downloads");
		driver.findElement(By.xpath("//a[@href='/Content/Download.zip']")).click();
		
		// If 'Ask where to download each file before saving' option is enabled then we have to use Robot Class to handle it.
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);;;
		
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
