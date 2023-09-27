package pageObjectModel;

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
	
	public String readExcelData(String excelpath, String sheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);	
	Row row = sheet.getRow(rowcount);
    Cell cell = row.getCell(cellcount);
	String data = cell.getStringCellValue();
	
    return data;
	}
	
	public void writeExcelData(String excelpath, String sheetname, int rowcount, int cellcount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}
	
	public int getLastRowCount(String excelpath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetName);
	    int rowcount = sheet.getLastRowNum();
	    return rowcount;
	
	}
	
	public String getPropertyData(String PropPath, String key) throws IOException
	{
	   FileInputStream fis = new FileInputStream(PropPath);
	   Properties prop = new Properties();
	   prop.load(fis);
	   String data = prop.getProperty(key);
	   return data;
	}
	

}
