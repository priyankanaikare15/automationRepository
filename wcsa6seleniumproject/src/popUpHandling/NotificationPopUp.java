package popUpHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {
   public static void main(String[] args) throws InterruptedException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Browser");
	String browserValue= sc.next();
	
	if(browserValue.equals("Chrome"))
	 {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	Thread.sleep(2000);
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.airvistara.com");
	 }
	 else if(browserValue.equals("Firefox"))
	 {
	FirefoxOptions f = new FirefoxOptions(); 
	f.addArguments("--disable-notifications");
	Thread.sleep(2000);
	WebDriver driver = new FirefoxDriver(f);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.airvistara.com");
}
	 else if(browserValue.equals("MSEdge"))
	 {
		 EdgeOptions e = new EdgeOptions();
		 e.addArguments("--disable-nitifications");
		 Thread.sleep(2000);
		 WebDriver driver = new EdgeDriver(e);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.airvistara.com");
	 }
   }
}
