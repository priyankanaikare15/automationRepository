package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//read a data from IPL sheet
		FileInputStream fis = new FileInputStream("./data/TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);   //used to read file
		Sheet sheet = wb.getSheet("IPL");   ///read sheet
		Row row = sheet.getRow(1);          //read given row
		Cell cell = row.getCell(1 );         //read given cell
		String data = cell.getStringCellValue();    //
		System.out.println(data);
	}

}
