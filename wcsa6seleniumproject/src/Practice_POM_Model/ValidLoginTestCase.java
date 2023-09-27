package Practice_POM_Model;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		
		bt.openBrowser();
		
		LoginPage lp = new LoginPage(driver);
		lp.valid_login();
		Thread.sleep(2000);
		bt.closeBrowser();
	}
	
	

}
