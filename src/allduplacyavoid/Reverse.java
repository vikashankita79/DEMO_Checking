package allduplacyavoid;

public class Reverse {

	public static void main(String[] args) {
		String s="Vikash-Kumar";
		String s2=new StringBuffer(s.substring(0,6)).reverse().toString()+"-"+new StringBuffer(s.substring(7,12)).reverse().toString();
System.out.println(s2);
	}

}
