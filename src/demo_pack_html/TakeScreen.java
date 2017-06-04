package demo_pack_html;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TakeScreen {

	
	static String s="123";
	static
	{
		
	System.out.println(Integer.parseInt(new StringBuffer(s).reverse().toString()));	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
public static void screenshot(WebDriver driver,String s) 
{
//	TakesScreenshot ts=(TakesScreenshot)driver;
	try
	{
	EventFiringWebDriver ts=new EventFiringWebDriver(driver);
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("G:\\mywork\\HTML_unit_Demo\\screenshot_folder"+ s + ".PNG"));
	
	

	}
catch(Exception e)
	{
	
	System.out.println("Exception is "+e.getMessage());
	
	}

}








}
