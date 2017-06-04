package demo_pack_html;

public class Prime_Using_Constructor {

	boolean prime=true;
	
	public Prime_Using_Constructor(int num) {
		for(int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				
				prime=false;
				
				
			}
			
			
		}
		
		System.out.println(prime);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Prime_Using_Constructor pri=new Prime_Using_Constructor(10);
	}

}
