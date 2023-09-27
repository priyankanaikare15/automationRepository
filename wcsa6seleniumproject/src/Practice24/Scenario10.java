package Practice24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.Bluestone.com");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("suhas");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("sarde17@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9988776690");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@placeholder='Reply here...']")).sendKeys("hello",Keys.ENTER);
		
		
	}

}
