package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	 String title = driver.getTitle();
	 
	 System.out.println("The ttile of the page is :"+title);
	 
	 if(title.equals("Google"))
	 {
		 System.out.println("The title is verified");
	 }
	 else
	 {
		 System.out.println("The title is not verified");
	 }
}
}
