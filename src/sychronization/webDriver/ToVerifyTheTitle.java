package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitle {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/"); //using GET abstract method--to navigate the url
		String title=driver.getTitle();         //using GETURL method to verify and fetch the title of current webpage
		System.out.println("The Title of the page is :"+title);
		
		if(title.equals("Selenium"))
		{
			System.out.println("Pass:the title is verified");
		}
		
		else
		{
			System.out.println("Fail:the title is not verified");
		}
		
	}
	


}
