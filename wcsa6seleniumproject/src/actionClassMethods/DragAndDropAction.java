package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//identify Source Element
		
		 WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		 WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000 ']")); 
		 WebElement source3 = driver.findElement(By.xpath(" //a[text()=' SALES '] "));
		 WebElement source4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
			
		 Thread.sleep(2000);
			
		//identify target Element
		 WebElement target1 = driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
		 WebElement target2 = driver.findElement(By.xpath("//ol[@id='amt7']/li[@class='placeholder']"));
		 WebElement target3 = driver.findElement(By.xpath("//ol[@id='loan']/li[@class='placeholder']"));
		 WebElement target4 = driver.findElement(By.xpath("//ol[@id='amt8']/li[@class='placeholder']"));
		 
		 
		 //perform drag and drop 
		 Actions act = new Actions(driver);
		 
		 act.dragAndDrop(source1, target1).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(source2, target2).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(source3, target3).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(source4, target4).perform();
	}

}
