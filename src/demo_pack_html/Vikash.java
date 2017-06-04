package demo_pack_html;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import allduplacyavoid.Browser_Open;

public class Vikash extends Browser_Open{
WebDriver driver;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Vikash dup=new Vikash();
	dup.duplicate(s);
	}

public void duplicate(String s1)
{
	
	    String[] str=  s1.split("//s");
	
	    Set set=new HashSet();
	    StringBuffer buffer=new StringBuffer();
	    
	    for(String word:str)
	{
		
		if(!set.contains(word))
		set.add(word);
		buffer.append(word+ " ");
		
		
		
	}
	
	System.out.println(buffer);
	
	
	
	
	
	
	
}







}
