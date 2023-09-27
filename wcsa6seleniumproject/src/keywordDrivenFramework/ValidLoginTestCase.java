package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		//to open and close browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//to read the valid UserName and Valid Password
		Flib flib = new Flib();
		//identify Username Text Box
		driver.findElement(By.name("username")).sendKeys(flib.readPropertydata("./data/config.properties","UserName"));
		//identify Password Text Box and pass password
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertydata("./data/config.properties","Password"));
		//identify Login Button
		driver.findElement(By.id("loginButton")).click();
		
	
		bt.closeBrowser();
	}
	

}
