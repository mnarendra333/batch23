class ForEachDemo
{

	public static void main(String... args)
	{
		
		int n[] = {10,20,30,40,50,60,70};
		
		
		
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
			if(n[i] == 40)
				break;
		}
		
		
		//advanced for loop
		for(int i:n)
			System.out.println(i);
		
		
		System.out.println("===============");
		int i=0;
		int length = n.length;
		
		while(i<length){
			
			System.out.println(n[i]);
			i++;
		}
		
	}

}