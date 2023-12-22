package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimension {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Shubham%20Automation/Xpath.html");
		
		WebElement textFieldWithValueA =driver.findElement(By.xpath("//input[@value='A']"));
		WebElement textFieldWithValueB =driver.findElement(By.xpath("//input[@value='B']"));
		WebElement textFieldWithValueC =driver.findElement(By.xpath("//input[@value='C']"));
		WebElement textFieldWithValueD =driver.findElement(By.xpath("//input[@value='D']"));
		WebElement textFieldWithValueE =driver.findElement(By.xpath("//input[@value='E']"));
		
		Dimension dimensionOfA = textFieldWithValueA.getSize();
		Dimension dimensionOfB = textFieldWithValueB.getSize();
		Dimension dimensionOfC = textFieldWithValueC.getSize();
		Dimension dimensionOfD = textFieldWithValueD.getSize();
		Dimension dimensionOfE = textFieldWithValueE.getSize();
		
		int heightOfA = dimensionOfA.getHeight();
		int widthOfA = dimensionOfA.getWidth();
		
		int heightOfB= dimensionOfB.getHeight();
		int widthOfB = dimensionOfB.getWidth();
		
		
		int heightOfC = dimensionOfC.getHeight();
		int widthOfC = dimensionOfC.getWidth();
		
		
		int heightOfD = dimensionOfD.getHeight();
		int widthOfD = dimensionOfD.getWidth();
		
		
		int heightOfE = dimensionOfE.getHeight();
		int widthOfE = dimensionOfE.getWidth();
		
		if(heightOfA == heightOfB && heightOfB == heightOfC && heightOfC ==heightOfD && heightOfD == heightOfE)
{
	System.out.println("Pass: The Dimension of all the textfield are same");
}
else
	System.out.println("Fail: The Dimension of all the textfield are not same");
		
		
		

	}

}
