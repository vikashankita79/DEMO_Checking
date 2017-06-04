package sheetreader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import jxl.common.Logger;

public class ExcelReader {
static Workbook wb;
static Sheet sheet;
static Row row;
	public ExcelReader()
	{
		
		try
		{
			
			File file =new File(".\\Excelfolder\\4TiGo-Issue Log.xlsx (10).xlsx");
			FileInputStream fsc=new FileInputStream(file);
			wb=WorkbookFactory.create(fsc);
		}
		
		catch(Exception e)
		{
			
			System.out.println("Exception is"+e.getMessage());
			
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		ExcelReader reader=new ExcelReader();
		sheet=wb.getSheet("vikash");
		row=sheet.getRow(5);
		Cell c1=row.getCell(4);
		        String Str = c1.getStringCellValue();
		System.out.println(Str);
				

	}
public void SheetName(String sheetName)
{
	
	
	 sheet=wb.getSheet(sheetName);
	
}
}
