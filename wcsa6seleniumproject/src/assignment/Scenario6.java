package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Scenario6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement ring = driver.findElement(By.xpath("//a[text()='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ring).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		Thread.sleep(1000);
		
		//get price list getOptios()
		WebElement priceList = driver.findElement(By.xpath("//span[text()='Price']/ancestor::section"));
	
		 Thread.sleep(2000);
		Select sel = new Select(priceList);
		
		List<WebElement> allPriceList = sel.getOptions();
		Thread.sleep(1000);
		for(int i=0; i<allPriceList.size();i++)
		{
			Thread.sleep(1000);
			allPriceList.get(i).click();
			System.out.println(allPriceList
					.get(i).getText());
		}
		
	}

}
