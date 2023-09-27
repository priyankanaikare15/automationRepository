package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("Aravi");
		driver.findElement(By.name("")).sendKeys("Aravi@123");
		WebElement loginButton = driver.findElement(By.xpath(""));
		loginButton.submit();
	}

}
