package Practice_POM_Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelData(String excelpath, String sheetName, int rowCout, int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowCout);
	    Cell cell = row.getCell(cellCount);
	    String data = cell.getStringCellValue();
	    return data;
	}
	
	public void writeExcelData(String excelpath, String sheetName, int rowCount, int cellCount, String  data) throws EncryptedDocumentException, IOException
	{
	  FileInputStream fis = new FileInputStream(excelpath);	
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet(sheetName);
	  Row row = sheet.getRow(rowCount);
	  Cell cell = row.createCell(cellCount);
	  cell.setCellValue(data);
	
	  FileOutputStream fos = new FileOutputStream(excelpath);
	  wb.write(fos);
	
	}
	
	public int getLastRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	}
	
	public String readPropertyData(String propPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
