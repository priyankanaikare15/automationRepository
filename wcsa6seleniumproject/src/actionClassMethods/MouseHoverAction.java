package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com");
		//handle hidden popup
		driver.findElement(By.id("denyBtn")).click();
		//Identify Watch Jewellery
		WebElement element = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		//Perform Mouse Hover Action
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		Thread.sleep(2000);
		//Identify Band and click on Band
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
	}

}
