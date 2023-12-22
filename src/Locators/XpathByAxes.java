package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=14824784882236146791&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061644&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		
		String price = driver.findElement(By.xpath("//img[@ alt = 'Sponsored Ad - Apple iPhone 12 (64GB) - (Product) RED']/ancestor::div[@class= 'sg-row']/descendant::span[text()='53,999']")).getText();
		
		System.out.println(price);
		
	}

}
