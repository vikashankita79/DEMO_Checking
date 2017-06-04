package allduplacyavoid;

import java.io.IOException;
import java.io.PrintWriter;

public class Parent {

         public void m1(int i)
         {
        	 
        	 
        	 
         }

protected String m1(String str)
{
	
	
	
	return str;
}

 public void m2() throws Throwable
{
	
	
	
}
}
class Child extends Parent
{
public void m2() throws IOException
	{
		
		Runtime.getRuntime().exec("notepad");
		
	}
	

	
}
class Mainrun
{
	
	public static void main(String args[]) throws Throwable
	{
		
		Child child=new Child();
		child.m2();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}