package demo_pack_html;

import java.util.ArrayList;
import java.util.List;

public class String_Charcter {
int n=0;
	public static void main(String[] args) {
	int[] a1={10,5,16,2,5,10,5};
	
	String_Charcter stt=new String_Charcter();
	stt.duplicate(a1);
	
	
	}
public void duplicate(int[] i1)
{
	List<Integer> list=new ArrayList();
	List<Integer> list2=new ArrayList();
	for(int i=0;i<i1.length;i++)
	{
		
		if(!list.contains(i1[i]))
		{
			n++;
			list.add(+i1[i]);
			
			
		}
		else
		{
			
			list2.add(i1[i]);
			
		}
		
		
	}
	System.out.println(list);
	System.out.println(list2);
	
}
}
