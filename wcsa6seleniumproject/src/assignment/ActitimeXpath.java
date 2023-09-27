package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeXpath {
	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://127.0.0.1:8080/login.do");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
     driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[text()='Login']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[.='Tasks']/ancestor::td[contains(@class,'navItem relative')]")).click();
     Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[.='Reports']/ancestor::td[contains(@class,'navItem relative')]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[.='Users']/ancestor::td[contains(@class,'navItem relative')]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[.='Work Schedule']/ancestor::td[contains(@class,'navItem relative')]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[.='Settings']/ancestor::td[contains(@class,'navItem relative')]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[.='Logout']")).click();
     Thread.sleep(3000);
     driver.quit();
     }

}
