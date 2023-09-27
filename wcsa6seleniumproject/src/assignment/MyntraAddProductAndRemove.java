package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAddProductAndRemove {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Shose");
	    driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	    
	    String parentBrowser = driver.getWindowHandle();
	    
	    driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
	    
	    Set<String> allHandles = driver.getWindowHandles();
	    
	    for(String window:allHandles)
	    {
	    	if(!window.equals(parentBrowser))
	    	{
	    		driver.switchTo().window(window);
	    		driver.findElement(By.xpath("//p[text()='7']")).click();
	    		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("411012");
	    		driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
	    	}
	    }
	    
	}

}
