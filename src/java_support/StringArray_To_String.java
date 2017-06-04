package java_support;

public class StringArray_To_String {
	static String s2;
	private static void main(String[] args) {
		String[] str={"vikash","Ankita","Alka"};
	   StringBuffer buffer=new StringBuffer();
	   
		for(String s:str){
			System.out.println(s);
		 s2=buffer.append(s+" ").toString();
		}

	System.out.println(s2);
	
	
	}

}
