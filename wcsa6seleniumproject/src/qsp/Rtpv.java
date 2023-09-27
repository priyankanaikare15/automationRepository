package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtpv {
	
	static WebDriver driver; // declare Static variable
	
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc =new Scanner(System.in); //Scanner class to take input from user
		System.out.println("Enter Browser Name");
		String browserValue = sc.next();
		
		//Method of String class  -> equalsIgnoreCase(String var)
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2001);
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2500);
			driver.close();	
		}
		else
		{
			System.out.println("Invalid Driver Name");
		}
			
	}

}
