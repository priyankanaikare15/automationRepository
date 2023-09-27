package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver =new ChromeDriver();	
	 driver.manage().window().maximize();
	 
	 driver.get("http://testvm01:8080/login.do");
	 Thread.sleep(2000);
	 //Identify the username text box by using name locator
	 driver.findElement(By.name("username")).sendKeys("admin");
	 Thread.sleep(1000);
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 Thread.sleep(1000);
	 //Identify login button by using id locator
	 driver.findElement(By.id("loginButton")).click();
	 
	}

}
