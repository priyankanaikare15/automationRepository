package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VistaraFlightBooking 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Plan Travel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[(text()='Flights') and (contains(@class,'text-highlight'))]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Search o')]")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Search destinat')]")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='1 Adult']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("depart")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@monthname='Aug']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-state-default' and (text()='5')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-state-default' and (text()='7')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pb-searchflight")).click();	
		Thread.sleep(8000);
		driver.quit();
		
		
	}	
}
