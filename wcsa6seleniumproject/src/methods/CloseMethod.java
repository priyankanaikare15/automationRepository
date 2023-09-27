package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	
	public static void  main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the WebApplicating
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.close();
		
	}

}
