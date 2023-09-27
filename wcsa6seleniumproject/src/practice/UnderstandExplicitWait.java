package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UnderstandExplicitWait {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com");
		//click on any one product
			driver.findElement(By.cssSelector("img[alt='boys shirt']")).click();
			//Identify box of pin code
			driver.findElement(By.id("Check Delivery")).sendKeys("123456");
			//click on check button
			WebElement  checkButton = driver.findElement(By.id("Check"));
			
			explicitWait(driver,60,checkButton).click();
	}
	public static WebElement explicitWait(WebDriver driver, int sec, WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement el =wait.until(ExpectedConditions.elementToBeClickable(ele));
		return el;
	}

}
