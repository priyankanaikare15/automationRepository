package testNGPackage;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMAssertion {
	static WebDriver driver;
  @Test
  public void login_Method() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(driver.getTitle(), "title");
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[.=' Login ']")).submit();
	
	
	
	
 driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).click();
	
	WebElement webElement = driver.findElement(By.partialLinkText("Logout"));
	String homepage= "OrangeHRM.as";
	Assert.assertEquals(driver.getTitle(), homepage);
	//Assert.assertEquals(webElement.isDisplayed(),true );
	webElement.click();
	//sa.assertAll();
}
}
