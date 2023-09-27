package testNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProvider {

	static WebDriver driver;
	
  @Test(dataProvider = "actiTimeTestData")
 
  public void invalidLoginMethod(String usn, String pass) 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1:8080/login.do");
	  
	  driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  driver.findElement(By.id("loginButton")).click();
	  driver.findElement(By.name("username")).clear();
  }
  
  @DataProvider(name = "actiTimeTestData")
  
  public Object [] [] data()
  {
	  Object [] [] testdata = new Object [5] [2];
	  
	  testdata [0] [0] ="admin";
	  testdata [0][1]="     ";
	  
	  
	  testdata [1][0]="    ";
	  testdata [1][1]="manager";
	  
	  testdata [2] [0]="ad_min ";
	  testdata [2] [1]="mana_ger";
	  
	  testdata [3][0]="manager";
	  testdata [3][1]="admin";
	  
	  testdata [4][0] ="admin123";
	  testdata [4][1]="manager123";
	  
	  return testdata;  
	  
  }
}
