//out side class diff package has-A
package pack2;
import pack1.Base;
class OPDerivedHasA
{


	public static void main(String args[])
	{
		Base obj = new Base();
		//obj.a+ " "+ =>error: a has private access in Base
		//b is not public in Base; cannot be accessed from outside package
		//obj.c+" "+ => error: c has protected access in Base (we can access protected only with is-A relationship)
		System.out.println(obj.d);
		
	}


}