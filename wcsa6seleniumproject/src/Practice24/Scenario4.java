package Practice24;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
	static WebDriver driver;
	public static void search_product(String product)
	{
		driver.findElement(By.id("gh-ac")).sendKeys(product);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByValue("281");
		driver.findElement(By.id("gh-btn")).submit();
	}
	public static void print_result()
	{
		WebElement product = driver.findElement(By.xpath("//span[contains(text(),'8 Pack')]/ancestor::div[@class='s-item__wrapper clearfix']"));
	   System.out.println(product.getText());
	  
	}
	public static void print_fullresult()
	{
		
	   WebElement allproduct = driver.findElement(By.xpath("//span[contains(text(),'8 Pack')]/ancestor::ul[@class='srp-results srp-grid clearfix']"));
	   
	
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser Value");
		String browservalue = sc.next();
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.Ebay.com");
			search_product("Apple Watches");
			print_result();
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.Ebay.com");
			search_product("Apple Watches");
		}
		else if(browservalue.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.Ebay.com");
			search_product("Apple Watches");
		}
		else
		{
			System.out.println("Please Enter valid Browser Value");
		}
		 
		
//       Thread.sleep(2000);
//       driver.quit();
////		
	}

}
