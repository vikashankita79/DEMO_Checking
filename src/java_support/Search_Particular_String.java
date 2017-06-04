package java_support;

public class Search_Particular_String {

	public static void main(String[] args) {
		String s="Vikash Kumar";
		check(s);

	}

public static void check(String str)
{
	
	for(int i=0;i<str.length();i++)
	{
		
		if(str.charAt(i)=='u')
		{
			
			
			System.out.println("Character present at"+"    "+ (i )+str.charAt(i));
			
		}
		
		else
		{
			
			System.out.println("Character not present");
			
		}
	}
	
	
}








}
