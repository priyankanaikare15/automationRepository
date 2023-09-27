package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();	
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   driver.get("https://www.facebook.com");
		   
		   driver.findElement(By.xpath("//a[@id='u_0_0_i5']")).click();
		   WebElement dropDownEle = driver.findElement(By.id("month"));
		   Select sel = new Select(dropDownEle); 
		   Thread.sleep(2000);
		   sel.selectByIndex(10);
	}

}
