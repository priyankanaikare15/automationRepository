package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		String parentWindow = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Set<String> allHandle = driver.getWindowHandles();
		for(String window:allHandle)
		{
			if(!window.equals(parentWindow))
			{
				Thread.sleep(1000);
				driver.switchTo().window(window).close();
			}
		}
	}

}
