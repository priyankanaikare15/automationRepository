package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	Thread.sleep(1000);
	//get all window address
	Set<String> allHandles = driver.getWindowHandles();
	//read the address with the help of for each loop
	for(String window:allHandles)
	{
		Thread.sleep(1000);
		//Close the browser by switch the address of window
		driver.switchTo().window(window).close();
	}

}
}
