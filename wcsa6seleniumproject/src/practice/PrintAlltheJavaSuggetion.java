package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAlltheJavaSuggetion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> AllSuggetionsofjava = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		for(int i=0;i<AllSuggetionsofjava.size();i++)
		{
			System.out.println(AllSuggetionsofjava.get(i).getText());
		}
		//driver.quit();
	}

}
