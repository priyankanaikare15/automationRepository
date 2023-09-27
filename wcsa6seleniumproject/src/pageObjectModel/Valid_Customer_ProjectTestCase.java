package pageObjectModel;

import java.io.IOException;

public class Valid_Customer_ProjectTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// 
		BaseTest bt = new BaseTest();
		//Open the Browser
		bt.openBrowser();
		
		//to read the username, password and customer&project creds
		Flib flib = new Flib();
        
		//perform valid login
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.getPropertyData(PROP_PATH, "UserName"), flib.getPropertyData(PROP_PATH, "Password"));
		
		//
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.click_on_Task_Module();
		
		//
		Thread.sleep(2000);
		TaskPage tp = new TaskPage(driver);
		tp.create_New_Customer_Method(flib.readExcelData(EXCEL_PATH, CUSTOMER_PROJECT_SHEETNAME, 2, 0));
		
		Thread.sleep(2000);
		
		tp.create_New_Project_Method(flib.readExcelData(EXCEL_PATH, CUSTOMER_PROJECT_SHEETNAME, 2, 0),flib.readExcelData(EXCEL_PATH, CUSTOMER_PROJECT_SHEETNAME, 1,1));
		
		Thread.sleep(4000);
		bt.closeBrowser();
	}

}
