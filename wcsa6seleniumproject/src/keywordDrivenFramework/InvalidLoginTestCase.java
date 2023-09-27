package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		
		bt.openBrowser();
		//Read the invalid username and password from ActitimetestData excel file
		Flib flib = new Flib();
		//get the last rowcount
		int rowcount = flib.getLastRowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");
		
		for(int i=1;i<=rowcount;i++)
		{
			//identify WebElement and pass Invalid credential
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 1));
			driver.findElement(By.id("loginButton")).click();
			//Cleare the userName textBox
			driver.findElement(By.name("username")).clear();
		}
		Thread.sleep(2000);
		bt.closeBrowser();
		
	}

}
