package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_GetCssValue {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//identify user name TextBox
	String attribute = driver.findElement(By.name("username")).getAttribute("placeholder");
     System.out.println(attribute);
     
   //Identify Login Button
    String attributevalue = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("height");
    System.out.println(attributevalue);
	}

}
