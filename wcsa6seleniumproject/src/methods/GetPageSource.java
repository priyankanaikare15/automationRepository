package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	// it is use to get the page source code
	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver(); 

driver.manage().window().maximize();

driver.get("https://www.shoppersstop.com/");
//read the source code 
String loginPageSourceCode = driver.getPageSource();
System.out.println(loginPageSourceCode);
driver.close();

	}

}
