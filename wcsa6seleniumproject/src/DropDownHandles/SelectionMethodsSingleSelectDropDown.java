package DropDownHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethodsSingleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
		 WebElement dropDown = driver.findElement(By.id("menu"));
		  Select sel = new Select(dropDown);
		  Thread.sleep(2000);
		  sel.selectByIndex(1);  //Select by using index
		  Thread.sleep(2000);
		  sel.selectByValue("v4"); //selecting by using value
		  Thread.sleep(2000);
		  sel.selectByVisibleText("Satara");  //selecting by using text value
	}

}
