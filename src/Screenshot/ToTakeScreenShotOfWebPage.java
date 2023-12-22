package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfWebPage {

	public static void main(String[] args) throws IOException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to url
		driver.get("https://www.selenium.dev/");
		
		//1.Downcasting driver to TakeScreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		//Taking the screenshot in file format
		File source = ts.getScreenshotAs(OutputType.FILE);
		//Determining the destination for the screenshot in the project
		//File destination = new File("./screenshot/errorshot.png");
		File destination = new File("./screenshot/error.png");
		//Copying the screenshot to the destination
		Files.copy(source, destination);
		

	}

}
