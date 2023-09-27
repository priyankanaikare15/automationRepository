package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//it is used to store generic methods
	//all the methods are reusable methods and also all are non static
	
	//read the data from excel
	public String readExcelData(String excelpath, String sheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
      FileInputStream fis = new FileInputStream(excelpath);
      Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet= wb.getSheet(sheetName);
	  Row row = sheet.getRow(rowcount);
	  Cell cell = row.getCell(cellcount);
	  String data = cell.getStringCellValue();
	  return data;
	}
	
	//Write the data into excel sheet
	public void writeExcelData(String excelpath, String sheetName,int rowcount, int cellcount, String data ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		cell.setCellValue(data);
	}
	
	//get the last row from excel
	public int getLastRowCount(String excelpath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int row = sheet.getLastRowNum();//it is use to get last count of row where we store the data
		return row;
	}
	//read Property data
	public String readPropertydata(String propPath, String Key ) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(Key);
		return data;
		
	}

}
