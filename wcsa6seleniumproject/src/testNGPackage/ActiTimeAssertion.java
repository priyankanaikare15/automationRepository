package testNGPackage;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeAssertion {
	static WebDriver driver;
  @Test
  public void login_Method() {
	driver=  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(" http://127.0.0.1:8080/login.do");
	
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(driver.getTitle(),"title");    //soft assert
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	String titleofhomepage="actiTIME - Enter Time-Track";
	//Assert.assertEquals(driver.getTitle(),titleofhomepage);       //HardAssert
	
	WebElement logout = driver.findElement(By.linkText("Logout"));
	
	//Assert.assertEquals(logout.isDisplayed(),true);    //hard Assert
	
	logout.click();
	
	sa.assertAll();
	
  }
}
