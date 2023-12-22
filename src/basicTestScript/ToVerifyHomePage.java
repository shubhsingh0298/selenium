package basicTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.HomePage;
import pom.LoginPage;

public class ToVerifyHomePage {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login= new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.contains("Enter")) {
			System.out.println("Pass: The title is verified");
		}
		
		else
			System.out.println("Fail:The title is not verified");
		
		//logout steps
		
		HomePage home = new HomePage(driver);
		home.logoutAction();
		driver.quit();
		
		//login.usernameTextField.sendKeys("admin");
		
		//driver.navigate().refresh();
		
		//login.usernameTextField.sendKeys("manager");
	}

}
