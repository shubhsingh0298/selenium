package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.actitime.com/login.do"); 
		 
		 String sourceCode=driver.getPageSource();
		// System.out.println(sourceCode);
		 
		 //for ignore sensetive cases
		 System.out.println(sourceCode.equalsIgnoreCase("actitime"));

	}
	
	
	

}
