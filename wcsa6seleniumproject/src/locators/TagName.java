package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
	    // Identifying User name text box by using tag name locator
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("input")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("input")).sendKeys("Manager");
	    Thread.sleep(2000);
	    driver.close();
	 
		
	}

}
