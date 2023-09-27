package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//use navigate method and launch the web application
		
		driver.navigate().to("https://www.google.com");
		
		//Use navigate perform backward operation
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Use navigate perform forward operation
		driver.navigate().forward();
		Thread.sleep(2000);
		//Use navigate to perform Refresh Operation
		driver.navigate().refresh();
		
	}

}
