package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
//it is use to store Generic Reusable Methods
// All the Generic Reusable Method are non static
      public String readExcelData(String excelPath, String sheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
      {
    	  FileInputStream fis = new FileInputStream(excelPath); //Provide path
    	  Workbook wb = WorkbookFactory.create(fis); //make the file ready for read
    	  Sheet sheet = wb.getSheet(sheetName);      //get into sheetName
    	  Row row = sheet.getRow(rowcount);          //get into the desired row
    	  Cell cell = row.getCell(cellcount);        //get into desired cell
    	  String data = cell.getStringCellValue();   //use to read the value
    	  return data;
	  }
      
      //Write the data into the Excel sheet
      public void writeExcelData(String excelpath, String sheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
      {
    	  FileInputStream fis = new FileInputStream(excelpath);
    	  Workbook wb = WorkbookFactory.create(fis);
    	  Sheet sheet = wb.getSheet(sheetName);
    	  Row row = sheet.getRow(rowcount);
    	  Cell cell = row.createCell(cellcount);
    	  cell.setCellValue("Admin321");
    	  
    	 FileOutputStream fos = new FileOutputStream(excelpath);
    	 wb.write(fos);
    	 
      }
      //get the last row count from the excel
      
      public int getLastRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
      {
    	  FileInputStream fis = new FileInputStream(excelpath);
    	 Workbook wb = WorkbookFactory.create(fis);
    	 Sheet sheet = wb.getSheet(sheetName);
    	int row = sheet.getLastRowNum();  //it is use to get last count of row where we store the data
      return row;
      }

}
