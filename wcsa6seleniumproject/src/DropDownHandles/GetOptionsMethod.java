package DropDownHandles;
a
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
		WebElement dropDownElement = driver.findElement(By.name("menu"));
	Select sel	= new Select(dropDownElement);
	List<WebElement> alloption = sel.getOptions();
	//To read as well as print the list of WebElement
	for(int i=0;i<alloption.size();i++)
	{
		Thread.sleep(2000);
		alloption.get(i).click();
		System.out.println(alloption.get(i).getText()); 
		
		
		//System.out.println(opt);
	}
	// for each loop
	/*for(WebElement opt :alloption )
	{
		System.out.println(opt.getText()); 
	}*/
	
	
	}

}

