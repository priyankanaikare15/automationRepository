package dynamicScreenShot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomeListener.class)
public class TestCase extends BaseTest {
  @Test
  public void loginMethod() 
  {
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(driver.getTitle(),"title");
	  
	 driver.findElement(By.name("username")).sendKeys("admin");;
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginButton")).click();
	 Reporter.log("Login Successfully", true);
	 Assert.fail();
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void create_User()
  {
	  driver.findElement(By.name("username")).sendKeys("admin");;
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
	  Reporter.log("User Create",true);
  }
  @Test(dependsOnMethods ="create_User" )
  public void logoutMethod()
  {
	  driver.findElement(By.name("username")).sendKeys("admin");;
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
	  Reporter.log("Logout",true);  
  }
}
