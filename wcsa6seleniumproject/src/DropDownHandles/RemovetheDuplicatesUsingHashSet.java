package DropDownHandles;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

   public class RemovetheDuplicatesUsingHashSet
   {
    public static void main(String[] args)
    {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
	WebElement dropDownElemenet = driver.findElement(By.name("state"));
	//Handle Drop-Down
    Select sel = new Select(dropDownElemenet);
    //Remove Duplicate from DropDown using Hash Set
    HashSet<String> hs = new HashSet<String>();
    //Read the Option from DropDown
   List<WebElement> alloption = sel.getOptions();
    for(int i=0;i<alloption.size();i++)
    {
    	String option = alloption.get(i).getText();  
    	//add text into Hash Set and maintain insertion order
    	hs.add(option);
    }
    //read options from Hash Set
    for(String opt:hs)
    {
    	System.out.println(opt);
    }
	
}
}
