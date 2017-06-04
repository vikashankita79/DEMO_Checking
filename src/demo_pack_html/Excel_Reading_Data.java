package demo_pack_html;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reading_Data {
	 static XSSFCell cell;
	 static FileInputStream fis;
static XSSFWorkbook wb;
	static XSSFRow row;
	static XSSFSheet sheet;
	 public static void main(String[] args) {
	try
	{
		File file =new File("E:\\Excel_for_checking\\check.xlsx");
		fis=new FileInputStream(file);
	     wb=new XSSFWorkbook(fis);
	     sheet=wb.getSheet("Sheet1");
	     row=sheet.getRow(0);
	  
	    cell=row.getCell(1);
	    
	   
	   
	   if(cell.getCellType()==cell.CELL_TYPE_STRING)
	    {
	    	
	    	System.out.println(cell.getStringCellValue());
	    	
	    }
	    else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
	    {
	    	System.out.println(cell.getNumericCellValue());
	    	
	    	
	    }
	   
	    else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
	    {
	    	System.out.println(cell.getBooleanCellValue());
	    	
	    }
	}
	catch(Exception e)
	{
		
		  
		    	
		    	System.out.println("Blank data given");
		    	
		    
		
	}
	}

}
