package sheetreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_Data {
static Cell c1;
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File file=new File("D:\\Excel reader\\Data.xlsx");
        FileInputStream src=new FileInputStream(file);
        Workbook wb=WorkbookFactory.create(src);
	     Sheet sheet=wb.getSheet("Sheet1");
	    Row row=sheet.getRow(0);
	    Cell c0=row.getCell(0);
	    String s1 = c0.getStringCellValue();
	    System.out.println(s1);
	
	    String s2=sheet.getRow(0).getCell(1).getStringCellValue();
	    String s3=sheet.getRow(0).getCell(2).getStringCellValue();
	    System.out.println(s2);
	    System.out.println(s3);
	try
	{
	 c1=sheet.getRow(1).getCell(0);
	
        
	}
	
	catch(Exception e)
	{
		if(c1==null)
		{
			c1=sheet.getRow(1).createCell((short)(0));
			
		}
		    c1.setCellType(Cell.CELL_TYPE_STRING);
	        c1.setCellValue("hiii what are u");
	        
		}
		
		
	}
	
	
	
}
