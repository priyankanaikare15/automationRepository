// Launch BlueStone click and hold for (mouse action) Webelement-FilterBy and copy and paset in search text button and hit enter button
package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassScenario {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com");
		//handle hidden popup
		driver.findElement(By.id("denyBtn")).click();
				
		WebElement watchJwellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(watchJwellery).perform();
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		WebElement filteredBY = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		for(int i=1;i<=2;i++)
		{
		act.doubleClick(filteredBY).perform();
		act.clickAndHold(filteredBY).perform();
		}
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='search_query']")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='submit_search']")).submit();
		
		
		
	}

}
