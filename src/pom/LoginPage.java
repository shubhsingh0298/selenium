package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 //Constructor: To initialize the members
		
		public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);	
		
	}
	//Annotation: To identify the elements
	@FindBy(id="username")
	public WebElement usernameTextField;
	
	@FindBy(name="pwd")
	public WebElement passwordTextField;
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement loginButton;
	
	//BUsiness Logic
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}
