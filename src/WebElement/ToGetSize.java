package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSize {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Shubham%20Automation/Xpath.html");
		
		WebElement aTextFld = driver.findElement(By.xpath("//input[@value='A']"));
		
		Dimension dim = aTextFld.getSize();
		
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		System.out.println("Height = "+height);
		System.out.println("Width = "+width);
		
		
		
		

	}

}
