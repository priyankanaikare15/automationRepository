package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/cloudadmin/Desktop/c.html");
	  //Identify User name WebElement
	    WebElement USN = driver.findElement(By.id("i1"));
	   USN.sendKeys("Manager");
	   Thread.sleep(3000);
	   //Password  Disabled
	   //Explicit Type Cast Into JavaScriptExecutor
	   JavascriptExecutor jse   =(JavascriptExecutor)driver;
	   jse.executeScript("document.getElementById('i2').value='Password'");
	}

}
