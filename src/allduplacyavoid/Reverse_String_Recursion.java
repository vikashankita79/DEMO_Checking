package allduplacyavoid;

public class Reverse_String_Recursion {

	public static void main(String[] args) {
		String s="Hello";
		Reverse_String_Recursion rev=new Reverse_String_Recursion();
		System.out.println(rev.reverse(s));

	}
public String reverse(String str)
{
	if(str.length()<=0)
	{
		
		return str;
	}
	
	
		
		
		return reverse(reverse(str.substring(1))+str.charAt(0));
	

}
}
