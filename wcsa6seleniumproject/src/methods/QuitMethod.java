package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2500);
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	Thread.sleep(2500);
	//close parent browser
	//driver.close();
	//close parent and child browser
	driver.quit();
	
	}

}
