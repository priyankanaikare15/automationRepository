package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllCarSuggestins {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("car");
		Thread.sleep(5000);
		List<WebElement> carsuggetions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		/*for(int i=0;i<carsuggetions.size();i++)
		{
			System.out.println(carsuggetions.get(i).getText());
		}
		System.out.println(" All Car Suggetion "+carsuggetions.size());*/
		for(WebElement car :carsuggetions )
		{
			Thread.sleep(2000);	
		System.out.println(car.getText());	
		}
		
	}

}
