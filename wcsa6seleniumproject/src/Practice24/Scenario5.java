package Practice24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.Bluestone.com");
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(2000);
	WebElement webEle = driver.findElement(By.xpath("//a[@title='Rings']"));
	Actions action = new Actions(driver);
	action.moveToElement(webEle).perform();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Diamond Rings")).click();
	Thread.sleep(2000);
	WebElement price = driver.findElement(By.xpath("//span[text()='Price']"));
	action.moveToElement(price).perform();
	Select sel = new Select(price);
	List<WebElement> option = sel.getOptions();
	for(int i=0;i<option.size();i++)
	{
	 String opt = option.get(i).getText();
	 System.out.println(opt);
	}
    WebElement firstprice = driver.findElement(By.xpath("//span[@class='prcs-dlh']/input[@value='below rs 10000']"));
    firstprice.click();
   String data = firstprice.getText();
    System.out.println(data);
}
}
