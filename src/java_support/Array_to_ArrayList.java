package java_support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_to_ArrayList {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
        System.out.println(arr);
	
String s="javais good";
System.out.println(s.substring(1,6));
        List<Integer> list=new ArrayList<Integer>();
	
	for(int i:arr)
	{
		
		list.add(i);
		
	}
	System.out.println(list);
	
	int[] arr1=new int[list.size()];
	Arrays[] aa=new Arrays[10];
	
	for(int i=0;i<list.size();i++)
	{
		
arr1[i]= list.get(i);
	}
	
for(int i:arr1)
{
	System.out.println(i);
	
}
	}

}
