package java_code_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.TestNG;

public class Map_Demo {

	public static void main(String[] args) throws IOException {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Vikash");
		map.put(2, "Amrendara");
		map.put(3,"vishal");
		map.put(4,"Ankit");
		map.put(5,"Subhash");
		System.out.println(map);
       Set set=map.entrySet();
       Iterator itr=set.iterator();
       while(itr.hasNext())
       {
    	
    	   System.out.println(itr.next());
    	   
       }
	
	Logger logger = Logger.getLogger(Map_Demo.class);
	
	

	
	
	
	}

}
