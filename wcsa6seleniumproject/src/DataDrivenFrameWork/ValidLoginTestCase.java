package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase extends Flib{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:8080/login.do");
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 0);
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(username);
		Thread.sleep(1000);
		String password = flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1);
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
