package demo_pack_html;

import java.util.ArrayList;
import java.util.Arrays;

public class Common_Element {

	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5,6,7,8,9,10};
		int[] arr2={1,5,7,8,12,16};
	//	Arrays.sort(arr1);
		//Arrays.sort(arr2);
		
		ArrayList<Integer> list=new ArrayList();
		ArrayList<Integer> list2=new ArrayList();
		//ArrayList<Integer> list3=new ArrayList<>();
		
		for(int i1:arr1)
		{
			
			list.add(i1);
			
		}
			
			for(int i2:arr2)
			{
				if(list.contains(i2))
				{
					list2.add(i2);
					
				}
				else
				{
					
					
					//list2.add(i2);
				}
				
			}
			
			
			
			
		
 // System.out.println(list3);
	System.out.println(list2);
	}

}
