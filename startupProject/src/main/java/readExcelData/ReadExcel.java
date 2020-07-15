package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
public static void main (String[] args) throws Exception
{
	File src =new File("C:\\Users\\CG-DTE\\Desktop\\startupProject\\test data\\loginData.xlsx");
	
	FileInputStream fis= new FileInputStream(src);
	
	XSSFWorkbook wb =new XSSFWorkbook(fis);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	
//	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
//	
//	System.out.println("Data from Excel "+data0);
	
	int rowcount=sheet1.getLastRowNum();
	System.out.println(rowcount);
	for(int i=1; i<=rowcount;i++)
	{
		String data=sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);
	}
	
	wb.close();
}
}
