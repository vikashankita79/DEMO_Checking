package demo_pack_html;

import java.util.Scanner;



public class Number {


public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     String number = sc.nextLine();
 
	check(number);
	
	
	
}
public static void check(String number)
{
	double sum=0;
	for(int i=0;i<number.length();i++)
	{
		
		sum+=(int)number.charAt(i)-'0';
		
		Math.cbrt(sum);
	}
	
	System.out.println(sum);
	
}





}