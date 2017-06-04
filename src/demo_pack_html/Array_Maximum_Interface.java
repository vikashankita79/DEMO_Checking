package demo_pack_html;

import java.util.Arrays;

interface ArraysList
{
	public final int[] a1={1,2,4,6,7,8};
	
	
	
	
}











public class Array_Maximum_Interface implements ArraysList
{
	public Array_Maximum_Interface() {
		
		Arrays.sort(a1);
		System.out.println(a1[a1.length-1]);
		System.out.println(a1[a1.length-2]);
		
		
	}

	public static void main(String[] args) {
		Array_Maximum_Interface a2=new Array_Maximum_Interface();

	}

}
