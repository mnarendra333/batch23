class NumberDemo
{
	public static void main(String args[])
	{
		
		
		if(args.length>=3)
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
		
			//int a = 10,b = 20,c = 30;
			
			/*if(a>b && a>c)
				System.out.println("a is big "+a);
			else if(b>c)
				System.out.println("b is big "+b);
			else
				System.out.println("c is big "+c);*/
		
			int bigNumber = a>b&&a>c?a:b>c?b:c;
			System.out.println(bigNumber);
		}
		else
			System.out.println("input mismatch");
		
	}


}