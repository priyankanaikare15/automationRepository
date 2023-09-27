package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartMobilePrice {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(@href,'/mobile-phones')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@class='h1Fvn6']/descendant::p[.='Shop Now'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='POCO C51 (Royal Blue, 64 GB)']/../following-sibling::div/descendant::div/div/descendant::div[.='₹6,499']")).click();
	Thread.sleep(3000);
	driver.quit();
	}

}