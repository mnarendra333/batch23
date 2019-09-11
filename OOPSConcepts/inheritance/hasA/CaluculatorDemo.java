import java.util.Scanner;
class CaluculatorDemo
{
		/* public double sum(double x, int y)
		{
			System.out.println("m1");
			return x+y;
		} */
		
		/* public double sum(double x, double y)
		{
			System.out.println("m2");
			return (x+y);
		
		} */
		
		public float sum(float x, float y)
		{
			System.out.println("m3");
			return (x+y);
		}
		
		
		
		
		
		


		public static void main(String args[])
		{
			
			
			CaluculatorDemo obj = new CaluculatorDemo();
			double sumres = obj.sum(30,50);
			System.out.println("sum is "+sumres);
			
			
			
		}


}