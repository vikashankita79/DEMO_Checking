package demo_pack_html;

public class Parent_Child {

void m1()
{
	
	System.out.println("Parent method");
	
}
void m2()
{
	
	System.out.println("M2 poarent method");
}





}
class Child_Only extends Parent_Child
{
	
	void m1()
	{
		
		System.out.println("Child method...");
		
	}
	void m2()
	{
		
		System.out.println("child m2 method ....");
		
	}
	
	
	public static void main(String args[])
	{
		
		/*Parent_Child t1=null;
		t1.m1();
		t1.m2();*/
		Parent_Child t2=new Child_Only();
		t2.m1();
		t2.m2();
		
		
	}
	
	
	
	
	
	
	
}