package DropDownHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethodsMultipleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
		 WebElement multipleDropDown = driver.findElement(By.name("menu"));
		 //select Multiple Drop downs using selection methods
		   Select sel = new Select(multipleDropDown);
		  //using for loop
		   for(int i=0; i<4;i++)
		   {
			   Thread.sleep(2000);
			 sel.selectByIndex(i);  //select multiple using index
			}
	
		   
		  /* sel.selectByIndex(1);  //select using index 
		   Thread.sleep(1000);
		   sel.selectByValue("v2");   select using value
		   Thread.sleep(1000); 
		   sel.selectByVisibleText("Delhi");      select multiple using text          */
		   
		   
	}

}
