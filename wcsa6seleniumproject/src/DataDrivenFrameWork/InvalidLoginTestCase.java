package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:8080/login.do");
		
		Flib flib = new Flib();
		//get the last count of the row
	   int rowcount = flib.getLastRowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");
	   Thread.sleep(2000);
	   for(int i=1; i<rowcount; i++)
	   {
		  driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i,0)); 
		   Thread.sleep(1000);
		   driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i,0));
		   Thread.sleep(1000);
		   driver.findElement(By.id("loginButton")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.name("username")).clear();
		  
		
	   }
	   Thread.sleep(4000);
	   driver.quit();
		
	}

}
