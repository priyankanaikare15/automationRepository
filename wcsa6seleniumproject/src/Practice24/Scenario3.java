package Practice24;

import java.awt.AWTException;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://jqueryui.com");
		driver.findElement(By.partialLinkText("Droppable")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
	Actions action = new Actions(driver);
	action.dragAndDrop(src, dest).perform();
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("droppable"));
	String cssvalue = ele.getCssValue("color");
	Assert.assertEquals(cssvalue, "rgb(119, 118, 34)");
	//System.out.println(cssvalue);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.partialLinkText("Sortable")).click();
	

	

	
	}

}
