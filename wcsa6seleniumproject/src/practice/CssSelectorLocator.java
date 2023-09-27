package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver = new ChromeDriver();	
	  driver.manage().window().maximize();
	  //driver.get("http://127.0.0.1:8080/login.do;jsessionid=2s2r2h3qi6uh9");
	  driver.get("https://www.instagram.com");
	  Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[name*='na']")).sendKeys("admin");
	 driver.findElement(By.cssSelector("input[name^='p']")).sendKeys("adm");
	 driver.findElement(By.cssSelector("button[type*='s']")).click();
	 //driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	// driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	// Thread.sleep(2000);
	// driver.findElement(By.partialLinkText("View ")).click();
	 Thread.sleep(2000);
	 driver.close();
	}

}
