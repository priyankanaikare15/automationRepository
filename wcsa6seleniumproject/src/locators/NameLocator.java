package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Rihansh");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Rihansh@12");
		Thread.sleep(2000);
		
		
	}

}
