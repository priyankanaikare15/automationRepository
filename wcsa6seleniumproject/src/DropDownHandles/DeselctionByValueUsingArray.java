package DropDownHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselctionByValueUsingArray {
	public static void main(String[] args) throws InterruptedException {
   WebDriver driver= new ChromeDriver();	
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
   WebElement dropDownEle = driver.findElement(By.name("state"));
   Select sel = new Select(dropDownEle); 
   String arr[] = {"v1","v2","v3","v4","v5"};
   //select by value
   for(int i=0;i<arr.length;i++)
   {
	   Thread.sleep(2000);
	   sel.selectByValue(arr[i]);
   }
  // Deselect by value
   for(int i=0; i<arr.length; i++)
   {
	Thread.sleep(2000);
	sel.deselectByValue(arr[i]);   
   }
   


   
   
	}

}
