package Practice24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("gamil",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Email - Gmail - Google']")).click();
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("sardep17@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	
	
	
	
	
	
	
	
	
	}
	

}
