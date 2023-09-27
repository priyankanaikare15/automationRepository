package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:8080/login.do");
		//Login with invalid inputs
 driver.findElement(By.name("username")).sendKeys("admin123");;
		
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		 driver.findElement(By.name("username")).clear();
		 driver.findElement(By.name("username")).sendKeys("admin");
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	     driver.findElement(By.xpath("//a[text()='Login']")).click();
	     driver.findElement(By.xpath("//a[text()='Logout']")).click();
	     driver.quit();
		 
		//clear username
		//usernameTB.clear();  //it throws - StaleElementReferenceException
		//login with valid input
		
	}
	

}
