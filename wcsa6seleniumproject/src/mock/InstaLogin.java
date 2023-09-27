package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver	= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.get("https://www.instagram.com");
	//Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Priyanka");
	driver.findElement(By.name("password")).sendKeys("Priyanka@123");
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	//Thread.sleep(2000);
	driver.close();
	}

}
