package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SpiceJet
{
	public static void main(String[] args) throws InterruptedException
	{
		//Handle Notification popup
	     ChromeOptions co= new ChromeOptions();
		 co.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(co);
		driver .manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='manage booking']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']")).sendKeys("PRN102PQ");
	    driver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com / Doe']")).sendKeys("abc@gmail.com");
	    driver.findElement(By.xpath("")).click();
	    //driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).getText().trim();
	    //driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).getText().trim();;
	    //driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
        //driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
	      driver.findElement(By.xpath("//div[text()='SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets']")).click();
	
	
	}        
}
