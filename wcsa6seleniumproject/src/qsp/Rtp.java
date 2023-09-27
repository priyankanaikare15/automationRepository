package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	
	public static void main(String[] args) throws InterruptedException
	{
		//to take user input as scanner classe
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which Browser you want to open");
		String browserValue =scanner.next();
		
		//Method of String class  -> equalsIgnoreCase(String var)
		
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();	
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			}
		else if(browserValue.equalsIgnoreCase("Edge"))
				{
	          WebDriver driver = new EdgeDriver();
	          driver.manage().window().maximize();
	          Thread.sleep(2000);
	          driver.close();
				}
		else
		{
			System.out.println("Enter Valid Browser Name");
		}
	}

}
