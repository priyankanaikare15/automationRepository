package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	//It is use to get the url of current Webpage
	
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//launch the actiTime
	driver.get("https://www.shoppersstop.com/");
	//driver.get("http://127.0.01/login.do");
	
	//read the URL of login page
     String urlOfloginPage = driver.getCurrentUrl();
	System.out.println(urlOfloginPage);
	driver.close();
		
	}

}
