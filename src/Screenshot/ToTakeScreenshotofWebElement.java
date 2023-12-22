package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ToTakeScreenshotofWebElement {

	public static void main(String[] args) throws IOException {
		// Launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate the url
		driver.get("https://www.facebook.com/");
		File source = driver.findElement(By.name("login")).getScreenshotAs(OutputType.FILE);
		File destination =  new File("./screenshot/loginButton.png");
		Files.copy(source, destination);
		

	}

}
