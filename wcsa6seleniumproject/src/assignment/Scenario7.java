package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
		
		//get address of parent window
		String parentWindow = driver.getWindowHandle();
		
		//Move the cursor on All Jewellery
		WebElement webElement = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(webElement).perform();
		Thread.sleep(1000);
		
		//click on Kadas
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		Thread.sleep(1000);
		//click on first kadas image
		
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		Thread.sleep(1000);
		
		//get the parent as well as child window address
		Set<String> allWindow = driver.getWindowHandles();
		
		//Switch control from parent window to child window
		for(String window:allWindow)
		{
		  if(!parentWindow.equals(window))
		   {
			 Thread.sleep(1000);
		     driver.switchTo().window(window);
		   }
		}
		WebElement webElement1 = driver.findElement(By.xpath(" //span[text()=' Select Size ']"));
		webElement1.click();
		 Thread.sleep(1000);
		/*Select sel = new Select(webElement1);
		sel.selectByIndex(1);    */
		 
		 driver.findElement(By.xpath(" (//span[@class='size'])[1]")).click();
		 Thread.sleep(1000);
		 //click on Buy now
		 driver.findElement(By.id("buy-now")).submit();
		
		
	}

}
