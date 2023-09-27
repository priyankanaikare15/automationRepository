package DropDownHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
	WebElement dropDownElement = driver.findElement(By.name("state"));
    Select sel = new Select(dropDownElement);
    for(int i=0; i<5;i++)
    {
    	Thread.sleep(2000);
    	sel.selectByIndex(i);
    }
    WebElement wrappedEle = sel.getWrappedElement();
    System.out.println(wrappedEle.getText());
    
	}

}
