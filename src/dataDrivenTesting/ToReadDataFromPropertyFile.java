package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException  {


		//1. Covert the physical representation of the property file into java representation
		FileInputStream fis = new FileInputStream("./Test data/PropertyData.properties");
		
		Properties property = new Properties();
		
		//2.Call the load method from Properties class to read the java representation of the file
		property.load(fis);
		
		//3. Call the getProperty method and pass the key to get the value
		String UrlFromPropertyFile = property.getProperty("Url");
		String unFromPropertyFile = property.getProperty("un");
		String pwdFromPropertyFile = property.getProperty("pwd");
		
		//4.Printing the value in the console
		System.out.println(UrlFromPropertyFile);
		System.out.println(unFromPropertyFile);
		System.out.println(pwdFromPropertyFile);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(UrlFromPropertyFile);
		
		driver.findElement(By.id("username")).sendKeys(unFromPropertyFile );
		WebElement pwdTextField = driver.findElement(By.name("pwd"));
		
		pwdTextField.sendKeys(pwdFromPropertyFile);
		pwdTextField.sendKeys(Keys.ENTER);

		
		

	}

}
