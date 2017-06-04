package allduplacyavoid;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
Properties pro;
public Configuration_Reader()
{
	try
	{
	File file=new File(".\\configuration_propeerty\\config.properties");
	
	FileInputStream frc=new FileInputStream(file);
	pro=new Properties();
	pro.load(frc);
	}

catch(Exception e)
	{
	
	System.out.println("Exception Message is "+e.getMessage());
	
	}

}

public String urlPath()
{
	
	String url=pro.getProperty("URL");
	return url;
	
}

public String phantomJsPath()
{
	
	String jspath=pro.getProperty("phantomjs");
	
	return jspath;
}










}
