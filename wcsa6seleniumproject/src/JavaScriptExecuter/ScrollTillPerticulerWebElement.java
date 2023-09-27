package JavaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillPerticulerWebElement 
   {
	public static void main(String[] args) throws IOException, InterruptedException 
	 {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		//identify News webElement
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		
		//Point loc = newsElement.getLocation();
		
	/*	//Perform Scrolling till News WebElement
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy("+loc.getX()+","+(loc.getY()-90)+")");
	    */
		
		 Thread.sleep(2000);
		 //Take Screen Shot of WebElement
		 File source = newsElement.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/news.jpg");
		 Files.copy(source, dest);
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 // by passing the input as JS code
		 jse.executeScript("arguments[0].scrollIntoView(false)",newsElement);
	}

}
