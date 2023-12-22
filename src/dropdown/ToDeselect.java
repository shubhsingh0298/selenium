package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeselect {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate the url
		driver.get("https://demoqa.com/select-menu");
		
		//Identifying the dropdown
		WebElement dropdown =driver.findElement(By.id("cars"));
		
		Select select = new Select(dropdown);
		
		//Selecting the options
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		
		//fetching all selected options
		List<WebElement>selectedOptions = select.getAllSelectedOptions();
		System.out.println("The no. of options selected: "+selectedOptions.size()); //Number of options selected
		for(WebElement option:selectedOptions) {
			System.out.println(option.getText());
		}
		
		//Getting first option
		String firstOption = select.getFirstSelectedOption().getText();
		System.out.println("The First Option is :"+firstOption);

	}

}
