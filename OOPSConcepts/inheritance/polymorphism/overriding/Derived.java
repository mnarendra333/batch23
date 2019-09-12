
class Base
{

	public void doWork(int x)
	{
		
		
		System.out.println("squere value is "+(x*x));
	}

}

class Derived extends Base
{
	public void doWork(int x)
	{
		
		
		System.out.println("cube value is "+(x*x*x));
	}

	
	public static void main(String args[])
	{
		
		Base obj = new Derived();
		obj.doWork(5);
		
		
	}

}