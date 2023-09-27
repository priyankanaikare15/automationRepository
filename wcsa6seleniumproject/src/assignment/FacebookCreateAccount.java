package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateAccount {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@href,'#') and (text()='Create new account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Saisha");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Pradhan");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("priyankanaikare02@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Doms@123");
		Thread.sleep(1000);
		driver.findElement(By.name("birthday_day")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='12']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@aria-label='Month']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='May']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@aria-label='Year']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='2007']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		//driver.quit();
	   //driver.findElement(By.xpath("//input[contains(@aria-label,'Surname') and (contains(@class,'inputtext'))]")).sendKeys("Doms@123");
	}

}
