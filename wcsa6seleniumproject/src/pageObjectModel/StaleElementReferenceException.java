package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1:8080/login.do");
	WebElement usn = driver.findElement(By.name("username"));
	usn.sendKeys("admin1");
	WebElement pass = driver.findElement(By.name("pwd"));
	pass.sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	usn.clear(); 
	
	//System.out.println(usn);
	//Thread.sleep(2000);
	//driver.navigate().refresh();
	//Thread.sleep(4000);
	//usn.sendKeys("admin2");
	
	}

}
