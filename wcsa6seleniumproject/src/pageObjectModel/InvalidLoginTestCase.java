package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		 LoginPage lp = new LoginPage(driver);
		 
		 int rowCount = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);
		 for(int i=1;i<rowCount; i++)
		 {
			 Thread.sleep(2000);
		 lp.invalidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 0),flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 1));
		 }
		
	}

}
