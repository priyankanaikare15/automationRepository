package Practice24;

import java.time.Duration;
import java.util.Set;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test1 {
	public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notification");
	WebDriver driver=new ChromeDriver(co);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.myntra.com");
	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shose",Keys.ENTER); 
	driver.findElement(By.xpath("//img[@title='Puma Unisex Softride Pro Coast Training Shoes']")).click();
    
	Set<String> bothwindows = driver.getWindowHandles();
	for(String window:bothwindows)
	{
		System.out.println(window);
	}
	
	//driver.findElement(By.xpath("//p[text()='10']")).click();
	
	//driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("4111033");
}
}