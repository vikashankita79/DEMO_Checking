package demo_pack_html;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Palindrome {
public static void main(String args[])
{
	int[] a11={1,2,4,3,5,7,6,5,11,14,2,2};
	int [] a21={1,7,6,3,11,14,17,5,2};
	Palindrome pm=new Palindrome();
	pm.duplicate(a11, a21);
	
}

public void duplicate(int[] a1,int[] a2)
{
	List<Integer> list1=new ArrayList();
	List<Integer> list2=new ArrayList();
	for(int i1:a1)
	{
		list1.add(i1);
		
		
	}
	
	for(int i2:a2)
	{
		
		if(list1.contains(i2))
		{
			
			list2.add(i2);
		}
		
	}
	
	Iterator itr=list2.iterator();
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
	}
	
	
	
	
}












}
