package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SameWindowIds {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/login/");
	    String idForFacebook= driver.getWindowHandle();
	    
	    driver.navigate().to("https://www.instagram.com/accounts/login/");
	    String idForInstagram=driver.getWindowHandle();
	    
	    System.out.println("Id for Facebook is: " +idForFacebook);
	    System.out.println("Id for Instagram is: " +idForInstagram);
		
	}

}
