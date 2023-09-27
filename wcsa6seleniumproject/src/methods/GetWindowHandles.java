package methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//Scroll till open a pop up window link
		WebElement childBrowser = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", childBrowser);
		//click on link
		childBrowser.click();
		//address of parent as well as child window or browser
		Set<String> parentandchild = driver.getWindowHandles();
		System.out.println(parentandchild);
		
		//
		
	}

}
