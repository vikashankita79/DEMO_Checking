package java_code_package;

public class MyThreadDemo extends Thread {
public void run()
{
	
	
	for(int i=0;i<10;i++)
	{
		
		System.out.println("Parent Thread");
		
	}
	
	
}
}
class MainDemo
{
	
	public static void main(String args[])
	{
		
		MyThreadDemo demo =new MyThreadDemo();
		demo.start();
		
		for(int i=0;i<10;i++)
		{
			
			System.out.println("Child Demo");
			
			
		}
		
		MyThreadDemo demo2=new MyThreadDemo();
		demo2.start();
		
	}
	
	
	
	
	
	
	
	
}