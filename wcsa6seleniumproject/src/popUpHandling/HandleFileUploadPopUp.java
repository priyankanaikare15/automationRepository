package popUpHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.ilovepdf.com/");
	driver.findElement(By.xpath("//h3[text()='JPG to PDF']")).click();
	driver.findElement(By.id("pickfiles")).click();
	Thread.sleep(2000);
	//Handle File upload PopUp
	File file = new File("./autoitfiles/UploadFile1.exe");
	String absolutePath = file.getAbsolutePath();
	Thread.sleep(2000);
	Runtime.getRuntime().exec(absolutePath);
	Thread.sleep(5000);
	driver.quit();
	
	}

}
