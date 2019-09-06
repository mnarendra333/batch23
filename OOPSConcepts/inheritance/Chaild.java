class Parent
{
		public void sum(int x, int y)
		{
		
			System.out.println("sum is "+(x+y));
		}


}
class Chaild extends Parent
{
		public void sub(int x, int y)
		{
		
			System.out.println("sub is "+(x-y));
		}



		public static void main(String args[])
		{
			Chaild obj = new Chaild();
			obj.sub(100,50);
			
			obj.sum(100,50);
			
			Parent pobj = new Parent();
			pobj.sum(100,50);
			//pobj.sub(100,50); error usecase
		}


}