package dynamicScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1:8080/login.do");
  }
  //generic reusable method for take screenshot of failed method
  public void screenshot_of_failedmethod(String failedmethodname)
  {
	TakesScreenshot ts= (TakesScreenshot)driver;  
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Screenshots/"+failedmethodname+".png");
	try
	{
	Files.copy(source, destination);
	}
	catch(IOException e)
	{
		
	}
	
  }
  
  
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
