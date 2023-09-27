package popUpHandling;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		//Click on Setting
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		//Click on Logo & Color scheme
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		//Select Radio button
		driver.findElement(By.id("uploadNewLogoOption")).click();
		//Double Click on Choose File Button
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		//Action class object creation
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(target).perform();
		//File upload pop up will get open
		//Handle the file upload pop up
		File file = new File("");
		File abspath = file.getAbsoluteFile();
		//Runtime.getRuntime().exec(abspath);
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
