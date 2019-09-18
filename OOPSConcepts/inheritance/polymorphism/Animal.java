abstract class Animal
{

	public void sleep()
	{
	
		System.out.println("inside sleep method");
	
	}
	public abstract void action();

}
class Dog extends Animal
{
		
		public  void action()
		{
			System.out.println("Dog Barks!!!");
			
		}
		
		public static void main(String... args)
		{
			
			Animal obj = new Dog();
			obj.action();
			obj.sleep();
			
			Animal obj2 = new Lion();
			obj2.action();
			obj2.sleep();
			
			
		}
		
	
	
}
class Lion extends Animal
{
	
	public  void action()
	{
		
		System.out.println("Lion roars");
		
	}
	
}