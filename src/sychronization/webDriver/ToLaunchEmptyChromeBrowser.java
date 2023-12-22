package webDriver;


import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEmptyChromeBrowser {
	
	public static void main(String[] args) {
		//new ChromeDriver();
		
		
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("https://www.youtube.com/");
	}

}
