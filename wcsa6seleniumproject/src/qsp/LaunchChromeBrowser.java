package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException //InterruptedException belongs from java
	{
	// Launch Chrome Browser
		//1> create object for driver class 2> we need do the upcasting with Webdriver interface
		//3>use thread java method for wait for some time and then close 4>user method of WebDriver close()
		WebDriver driver = new ChromeDriver();
	
		// To Maximize the browser
		driver.manage().window().maximize();
		
	    //Stop the execution  of Script in 2 Seconds
		Thread.sleep(2000);  //java method   
		 
		//Close the Browser by calling method of Webdriver Interface
		driver.close();
		
		
	}

}
