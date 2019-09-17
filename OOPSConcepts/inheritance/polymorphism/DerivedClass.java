class BaseClass
{	
	int a;
	int b;
	
	public BaseClass(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("i am from BaseClass constructor");
		
	}
	
	public void method1()
	{
		
		System.out.println("i am from BaseClass method1");
	}
	public void method2()
	{
		System.out.println("i am from BaseClass method2");
	}

}
class DerivedClass extends BaseClass
{
	int c;
	int d;
	int a = 90;
	
	public DerivedClass(int a, int b, int c, int d)
	{
		super(a,b);
		this.c = c;
		this.d = d;
		System.out.println("i am from DerivedClass constructor");
	}
	public void method3()
	{
		// if you want to use the output of method2 in method3 you can use super modifier to
		// access super class method
		
		//super.method1();
		super.method2();
		//BaseClass obj = new BaseClass();
		//obj.method2();
		System.out.println("i am from DerivedClass method3");
	}
	public void method4()
	{
		int a = 50;
		System.out.println(this.a+" "+a+" "+super.a);
		System.out.println("i am from DerivedClass method4");
	}
	
	
	
	public static void main(String args[])
	{
		DerivedClass obj = new DerivedClass(10,20,30,40);
		obj.method3();
		obj.method4();
		
		//System.out.println(obj.c+" "+obj.d+" "+obj.a+" "+obj.b);
		//obj.method1();
		//obj.method2();
		//obj.method3();
		//obj.method4();
		
	}

}