package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod 
{
   public static void main(String[] args) throws InterruptedException
   {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:8080/login.do");
	Thread.sleep(2000);
	//Identify User name text box and pass the input as admin
	//To identify we use findElement Method
	//Once the WebElement found it returns WebElement(I) & Address of WebElement  
	WebElement UserNameTextBox = driver.findElement(By.name("username"));
	Thread.sleep(1000);
	UserNameTextBox.sendKeys("admin");
	System.out.println(UserNameTextBox);
	WebElement PasswordTextbox = driver.findElement(By.name("pwd"));
	Thread.sleep(1000);
	System.out.println(PasswordTextbox);
	PasswordTextbox.sendKeys("Manager");
	Thread.sleep(2000);
	driver.close();
	}
}
