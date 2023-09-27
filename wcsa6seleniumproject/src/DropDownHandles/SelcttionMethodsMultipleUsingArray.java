package DropDownHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelcttionMethodsMultipleUsingArray {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
		 WebElement multipleDropDown = driver.findElement(By.name("menu"));
		 //select Multiple Drop downs using selection methods
		   Select sel = new Select(multipleDropDown);
		  
		   //Select Multiple option from dropdown using SelectByValue  Mathod
		   String arr[]= {"v1","v2","v3","v4","v5","v6","v7"};
		   for(int i=0; i<arr.length; i++)
		   {
			 sel.selectByValue(arr[i]); 
			}
		   }
}
