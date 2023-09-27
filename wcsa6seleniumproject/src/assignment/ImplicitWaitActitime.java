package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitActitime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("http://127.0.0.1:8080/login.do");
		
		String Pagetitle = driver.getTitle();
		//System.out.println(Pagetitle);
		String pTitle="actiTIME - Login";
		if(pTitle.equals(Pagetitle))
		{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		System.out.println(Pagetitle);
		}
		String HPagetitle = driver.getTitle(); 
		String Homepage ="actiTIME - Enter Time-Track";
		if(Homepage.equals(HPagetitle))
		{
		 System.out.println(HPagetitle);
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		}
		else
		{
			System.out.println("Test Failed");  
		}
       driver.close();
	}

}
