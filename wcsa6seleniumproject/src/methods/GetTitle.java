package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	//It is used to get title of current page 
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver =new ChromeDriver();
		
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
  driver.get("http://www.instagram.com");
  
  String titleOfPage=driver.getTitle();
  System.out.println(titleOfPage);
  
  driver.close();
	}

}
