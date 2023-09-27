package pageObjectModel;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		
		lp.validLogin(flib.getPropertyData(PROP_PATH, "UserName"), flib.getPropertyData(PROP_PATH, "Password"));
	    Thread.sleep(3000);
	    bt.closeBrowser();
	}

}
