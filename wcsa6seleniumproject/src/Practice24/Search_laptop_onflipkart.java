package Practice24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_laptop_onflipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
		//driver.findElement(By.xpath("//div[contains(text(),'ASUS Chromebook Celeron Dual Core N4020 - (4 GB/6')]")).click();
		//String price = driver.findElement(By.xpath("(//div[text()='₹13,990'])[1]")).getText();
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		
		
		
		Thread.sleep(2000);
		List<WebElement> allsuggession1 = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0; i<allsuggession1.size(); i++)
		{
			
			String name_of_laptop = allsuggession1.get(i).getText();
			
			for(int j=i; j<=i;j++)
			{
				 String price = allprice.get(i).getText();
			     System.out.println(name_of_laptop + price);
			Thread.sleep(3000);
			}
			System.out.println();
		}
		//System.out.println(price);
	}

}
