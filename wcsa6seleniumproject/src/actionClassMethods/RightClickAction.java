package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com");
		
		//Handle hidden division popup
		driver.findElement(By.id("denyBtn")).click();
		
		//Identify Ring Option
		WebElement rightClick = driver.findElement(By.xpath("//a[text()='Rings '] "));
	    
		//Perform right click on Ring
		Actions act = new Actions(driver);
	    act.contextClick(rightClick).perform();
	}

}
