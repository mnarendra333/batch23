class Derived extends Base
{

	public void method2()
	{
		System.out.println(this.getClass()+" class method2");
		
	}
	
	
	public static void main(String args[])
	{
		
		Derived obj = new Derived();
		obj.method1();
		obj.method2();
		
	}


}