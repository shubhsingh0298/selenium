package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriver.Driver;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	 @FindBy(linkText="Logout")
	 public WebElement logoutlink;
	 
	 public void logoutAction() {
		 logoutlink.click();


	}
	 public String verifyHomePageTitle(String text ) {
		return driver.findElement(By.xpath("//input[text()='"+text+"']")).getText();
	 }

}
//findElement(By.xpath("//input[text()='"+text+"']")).getText();