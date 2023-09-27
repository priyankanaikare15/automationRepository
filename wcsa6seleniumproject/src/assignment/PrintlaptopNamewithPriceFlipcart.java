//Launch Flipkart and Print Lap-top Name with Price 
//Apply Filter 1.processor -corei5 2.brand-HP 3. customer rating-3or4 4.operating system-Windows-11

package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintlaptopNamewithPriceFlipcart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		//handle the exception
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptops");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
		Thread.sleep(2000);
		//Select HP Brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
	    Thread.sleep(2000);
	    //Select Windows 11 Operating System
	    driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
	    Thread.sleep(2000);
	    //Select Customer Rating
	    //driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
	    Thread.sleep(2000);
	    
	    //identify All the suggestions for Laptop
	    List<WebElement> AllLaptopSuggestions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	   
	    //Identify All the suggestions for for price of laptop
	    List<WebElement> AllPriceSuggestions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	    Thread.sleep(2000);
	    //use the looping statement to read
	   for(int i=0;i<AllLaptopSuggestions.size();i++)
	   {
		   String nameofLaptop= AllLaptopSuggestions.get(i).getText();
		   
		 for(int j=i; j<=i; j++)
		 {
			String PriceofLaptop = AllPriceSuggestions.get(j).getText(); 
			System.out.print(nameofLaptop +" : "+PriceofLaptop);
			Thread.sleep(3000);
		 }
		 System.out.println();
	   }
	   Thread.sleep(3000);
	    driver.close();
	    
	}   
	}    
	    
	    
	    
	    
	    
	    
//staleElementreferenceException	    
	    
	    /*
	    //Identify all the Suggetions of lap-top
	    List<WebElement> allSuggetions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    //use looping statements to read list
	    for(int i=0; i<allSuggetions.size();i++)
	    {
	    	String nameofLaptop=allSuggetions.get(i).getText();
	    	for(int j=i;j<all)
	    	{
	    		
	    	}  
	    	} */
	   

