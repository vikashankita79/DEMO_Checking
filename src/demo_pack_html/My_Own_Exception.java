package demo_pack_html;

public class My_Own_Exception extends ArithmeticException



{
public void add()
{
	try
	{
	throw new My_Own_Exception();
	}
	catch(Exception e)
	{
		
		System.out.println(e.getMessage());
		System.out.println("eXCEPTION hANDLE");
	}
}
	public static void main(String[] args) {
		My_Own_Exception own=new My_Own_Exception();
		own.add();
System.out.println(Math.cbrt(2.0));
	
	}

}
