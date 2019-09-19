//out side class diff package is-A
package pack2;
import pack1.Base;

class OPDerived extends Base
{


	public static void main(String args[])
	{
		OPDerived obj = new OPDerived();
		//obj.a+ " "+ =>error: a has private access in Base
		//b is not public in Base; cannot be accessed from outside package
		System.out.println(obj.c+" "+obj.d);
		
	}


}