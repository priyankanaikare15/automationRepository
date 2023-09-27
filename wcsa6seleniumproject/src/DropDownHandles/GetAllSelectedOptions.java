package DropDownHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/cloudadmin/Desktop/Login.html");
		WebElement dropDownElement = driver.findElement(By.name("menu"));
	Select sel	= new Select(dropDownElement);
	//select the option from dropdown
	for(int i=0; i<4; i++)
	{
		Thread.sleep(2000);
		sel.selectByIndex(i);
	}
	//to read the selected option
	List<WebElement> allopt = sel.getAllSelectedOptions();
	//print selected option
	for(WebElement opt : allopt)
	{
		Thread.sleep(4000);
		System.out.println(opt.getText());
	}
	}

}
