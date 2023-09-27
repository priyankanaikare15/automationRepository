package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyExplicitwaitcreatingstaticmethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com");
		driver.findElement(By.xpath("//img[@alt='women kurti']")).click();
		driver.findElement(By.name("Check Delivery")).sendKeys("432789");
		WebElement check = driver.findElement(By.name("Check"));
		explicitewait(driver, 60, check).click();
		driver.quit();
	}
		public static WebElement explicitewait(WebDriver driver, int sec, WebElement ele)
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return el;
		}
	}


