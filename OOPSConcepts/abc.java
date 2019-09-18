class ProgramFlow
{
		static{
				System.out.println("i am from static block");
				m1();
		}
		
		{
			System.out.println("i am from instance block");
			
		}
		public ProgramFlow()
		{	
			System.out.println("i am from dc");	
		}
		public static void m1()
		{
			System.out.println("i am from m1");	
			ProgramFlow obj = new ProgramFlow();
			obj.m2();
			
		}
		public void m2()
		{
			System.out.println("i am from m2");	
			
		}
		
		public static void main(String args[])
		{
		
			ProgramFlow obj = new ProgramFlow();
			System.out.println("i am from main method");
			
		}



}