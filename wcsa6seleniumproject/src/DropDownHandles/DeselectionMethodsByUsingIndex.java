package DropDownHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethodsByUsingIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
		  WebElement dropDownEle = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDownEle);
		//Select options by using selectByIndex() Method
		for(int i=0;i<4; i++)
		{
			Thread.sleep(2000);
		 sel.selectByIndex(i);	
		}
		//DeSelect options by using deSelectByIndex() Method
		for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
		    sel.deselectByIndex(i);	
		}
	}

}
