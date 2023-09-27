package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	//handle hidden division pop up
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    driver.findElement(By.name("q")).sendKeys("mobiles");
	Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();     //button[@aria-label='Search for Products, Brands and More'
	Thread.sleep(1000);
    //identify the first suggestion of mobile and print the price
	WebElement p =driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]"));
   String s=p.getText();
   System.out.println("Text content is : " + s);
    Thread.sleep(3000);
    driver.quit();
	}

}
//(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1] 
//(//div[[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]" Apple