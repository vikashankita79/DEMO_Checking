package demo_pack_html;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Create_Exception {
public static void create() 
{
	
	try {
		throw new IOException();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	System.out.println("Block executed");
	}
	
}
	public static void main(String[] args) throws IOException  {
		create();
System.out.println("pass");
PrintWriter wb=new PrintWriter("ab.txt");
wb.write("Hello hiiii");
for(int i=0;i<=10;i++)
{
Runtime.getRuntime().exec("notepad");
}

	}

}
