package allduplacyavoid;

public class ToCheck_Modifier {
int i=10;
 public ToCheck_Modifier() {
	System.out.println("Hello");
	System.out.println("My first Commit");
}

public ToCheck_Modifier(int i)
{
	this.i=i;
	//this();
	System.out.println("Number is printed");
	
	
}
void print()
{
	
	System.out.println("hello World");
	
}
void set()
{
	
	this.print();
	
}
}
class AllTime extends ToCheck_Modifier
{

AllTime()
{
	
	super(10);
	
	
}
public static void main(String args[])
{
	AllTime time=new AllTime();
	
	
	
}



}






