class StringDemo
{


	 static public void main(String... args)
	{
		
		String str = "pragim ";
		
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		
		System.out.println(str.toUpperCase());
		System.out.println("length is "+str.length());
		String str1 = str.trim();
		System.out.println("length is "+str1.length());
		
		
		
	}


}