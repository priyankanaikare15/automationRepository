package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://omayo.blogspot.com/");
	String parentWindow = driver.getWindowHandle();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	Thread.sleep(1000);
  Set<String> allHandles = driver.getWindowHandles();
  for(String window:allHandles)
  {
	  if(!window.equals(parentWindow))
	  {
		  Thread.sleep(1000);
		  driver.switchTo().window(window).manage().window().maximize();
	  }
  }
  }
}


