class PerfectNo
{
	public static void main(String args[])
	{
	
	
			//256
			
			int no = 123;
			int sum = 0,mul=1;
			while(no>0)
			{
				int r = no%10;
				sum  =sum+r;
				mul = mul*r;
				no = no/10;
				
			}
			if(sum == mul)
				System.out.println("given no is perfect!!!");
			else
				System.out.println("given no is not perfect!!!");
			
	
	}


}