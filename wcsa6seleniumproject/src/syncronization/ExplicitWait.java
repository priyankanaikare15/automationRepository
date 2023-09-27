package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	    driver.get("https://www.shoppersstack.com");
	//click on any one product
		driver.findElement(By.cssSelector("img[alt='boys shirt']")).click();
		//Identify box of pin code
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		//click on check button
		driver.findElement(By.id("Check"));
		
		//Use Explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();
		
		
		
	} 
	

}
    //To Apply Emplicit wait
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
//wait.until(ExpectedConditions. visibilityOfElementLocated(By.xpath("//a[@id='electronics']")));