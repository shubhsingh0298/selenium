package dataDrivenTesting;

import java.time.Duration;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import classTest.FetchData;

public class VerifyTheSearchFunctionality {
public static void main(String[] args) {
	
}
		
		FetchData fd = new FetchData();
		String url =fd.FetchDataFromExcelSheet("Sheet1",6,2);
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@name=\"app\"]"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		driver.findElement(By.id("searchboxinput")).sendKeys("Goa");

}
}
