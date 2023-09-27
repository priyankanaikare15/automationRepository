package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneChat {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		//chat box design under the frame
		//handle the frame first by identifying it
		
		//  driver.switchTo().frame(3);//1. way handle using index   
		
		// driver.switchTo().frame("fc_widget");  //2. way handle using Sting
		// 3.way using WebElement Frame Element
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(frameElement);
		//
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		chatbox.click();
		
		//Switch Controls the main page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Aarya");
		driver.findElement(By.id("chat-fc-email")).sendKeys("Arya@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543201");
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ember27']")).click();
		Thread.sleep(2000);
		driver.quit();
	
			}

}
