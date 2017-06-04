package demo_pack_html;

public class All_Prime_Numbers {

	public All_Prime_Numbers() {
		for(int i=2;i<50;i++)
		{
			
			for(int j=2;j<=i;j++)
			{
				
				if(j==i)
				{
					
					System.out.println(i);
					
				}
				if(i%j==0)
				{
					
					break;
				}
				
				
			}
			
			
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		All_Prime_Numbers prime=new All_Prime_Numbers();

	}

}
