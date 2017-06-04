package demo_pack_html;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

import allduplacyavoid.Configuration_Reader;
import allduplacyavoid.ToCheck_Modifier;
import jxl.common.Logger;

public class Html_Unit_Demo {
	 static WebDriver driver;
	static Logger logger;
	public static void main(String[] args) throws IOException {
		logger=Logger.getLogger(Html_Unit_Demo.class);
		   PropertyConfigurator.configure("Log4j.properties");
		Configuration_Reader reader=new Configuration_Reader();
		 System.out.println(reader.phantomJsPath());
		 System.out.println(reader.urlPath());
		 logger.info("url given");
        System.setProperty("phantomjs.binary.path", reader.phantomJsPath());
   
        driver = new PhantomJSDriver();	
        logger.info("driver open");
        driver.get(reader.urlPath());     
        logger.info("path given");
       
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     List<WebElement> list = driver.findElements(By.xpath("//a"));
	System.out.println(list.size());
        for(WebElement ele:list)
        {
        	logger.info("loop working");
        String linkurl=ele.getAttribute("href");
        TakeScreen.screenshot(driver,linkurl);
        	verifyLink(linkurl);
        	
        }
	
	
	
	
	}

public static void verifyLink(String linkurl) 
{
	try
	{
	URL url=new URL(linkurl);
	
	HttpURLConnection http=(HttpURLConnection)url.openConnection();
	
	http.setConnectTimeout(3000);
	http.connect();
	if(http.getResponseCode()==200)
	{
		System.out.println(linkurl+".........."+http.getResponseMessage());
		logger.info("check status of code");
	}
	
	if(http.getResponseCode()==http.HTTP_NOT_FOUND){
		
		System.out.println(linkurl+"........."+http.getResponseMessage()+"....."+http.HTTP_NOT_FOUND);
		
		logger.info("check status of fail");
	}
	
	}
	catch(Exception e)
	{
	TakeScreen.screenshot(driver,e.getMessage());	
	e.printStackTrace();
		
	}
	
	
	}

@AfterMethod
public void screenshot(ITestResult result)

{
	
	if(ITestResult.FAILURE==result.getStatus())
	{
		
		TakeScreen.screenshot(driver,"httpScreen");
		
		
		
	}
	
	
	
	
}








}
