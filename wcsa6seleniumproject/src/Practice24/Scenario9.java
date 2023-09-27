package Practice24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scenario9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.Bluestone.com");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(1000);
		
	WebElement Jwell = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(Jwell);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@title='Kadas']")).click();


		
	}

}
