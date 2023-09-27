package DropDownHandles;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovetheDuplicatesUsingTreeSet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
		WebElement dropdownElement = driver.findElement(By.name("state"));
		//handle DropDown
		Select sel = new Select(dropdownElement);
		//Remove Duplicate from DropDown using TreeSet
		TreeSet<String> ts = new TreeSet<String>();
		//Read the options from dropDown
		List<WebElement> alloption = sel.getOptions();
		for(int i=0;i<alloption.size();i++)
		{
			String opt = alloption.get(i).getText();
			//add text into treeSet and maintain insertion order
			ts.add(opt);
		}
		Thread.sleep(4000);
		
		
		//read options from treeSet
		
		for(String opt:ts)
		{
			Thread.sleep(4000);
			System.out.println(opt);
		}	
				
	}

}
