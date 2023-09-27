package methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//use Switchto method is switch the control to active elements
		
		// on google search box
		
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
