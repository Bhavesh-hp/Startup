package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
  
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelpath)
	{
		File src =new File(excelpath);
		
		try {
			FileInputStream fis= new FileInputStream(src);
			
			 wb =new XSSFWorkbook(fis);
		} catch (Exception e) {
		    System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		
	}

   public String getData(int sheetNumber,int row,int column)
   {
	   XSSFSheet sheet1=wb.getSheetAt(0);
	  String data0= sheet1.getRow(row).getCell(column).getStringCellValue();
	  return data0;
   }
	
   
   public int getRowCount(int sheetIndex)
   {
	   int row=wb.getSheetAt(sheetIndex).getLastRowNum();
	   row=row+1;
	   return row;
   }
	
	
}
