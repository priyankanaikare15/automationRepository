package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		            	     
	   //Identify Login Button
	      Dimension loginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getSize();
	      int height = loginButton.getHeight();
	      int width = loginButton.getWidth();
	      System.out.println("Height of the Login Button "+ height +" "+ " Width of the Login Button "+ " "+width );
	}

}
