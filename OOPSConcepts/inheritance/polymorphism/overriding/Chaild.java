//CE : final classes can not be inherided
final class Parent
{


	public  void method1()
	{
		
		System.out.println("i am from method1 - Parent");
	
	}


}
class Chaild extends Parent
{
	

	public static void main(String args[])
	{
	
		Chaild obj = new Chaild();
		obj.method1();
	
	}
}
