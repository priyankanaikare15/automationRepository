package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib{
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		// Read the data from property file to get the Browser value and Url
		Flib flib = new Flib();
		String browserValue = flib.readPropertydata("./data/config.properties","Browser");
		String url = flib.readPropertydata("./data/config.properties","Url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
		 driver=new FirefoxDriver();	
		}
		else if(browserValue.equalsIgnoreCase("MSEdge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid browser value");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}
