package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		
		//identify email or phone text box
		driver.findElement(By.id("id_userLoginId")).sendKeys("9876543210");
		Thread.sleep(1000);
		
		//identify password text box
		driver.findElement(By.id("id_password")).sendKeys("abC@123");
		
		//identify sign in button
		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
		
		
		
	}

}
