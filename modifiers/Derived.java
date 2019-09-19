//out side the class same package
package pack1;
class Derived extends Base
{





	public static void main(String args[])
	{
		
		Derived obj = new Derived();
		//obj.a+ " "+ =>error: a has private access in Base
		System.out.println(obj.b+" "+obj.c+" "+obj.d);
		
		
	}


}