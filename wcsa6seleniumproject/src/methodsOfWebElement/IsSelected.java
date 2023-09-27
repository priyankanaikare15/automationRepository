package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://127.0.0.1:8080/login.do");
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		 boolean checkBox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();
		 System.out.println(checkBox);
		 
		

	}

}
