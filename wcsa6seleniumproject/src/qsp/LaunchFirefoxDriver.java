package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
          
//Maximize the browser
     driver.manage().window().maximize();

     //Stop the Execution for 2 seconds
     Thread.sleep(3000);
     
     //close the Browser
     driver.close();
	}

}
