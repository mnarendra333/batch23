import java.util.Scanner;
class Caluculator
{
		public int sum(int x, int y)
		{
			
			return (x+y);
		}
		
		public int sub(int x, int y)
		{
			
			return (x-y);
		}
		
		public int mul(int x, int y)
		{
			
			return (x*y);
		}
		
		public int div(int x, int y)
		{
			
			return (x/y);
		}
		
		
		public void findTotal(double s1, double s2, double s3, double s4)
		{
			
				System.out.println("Toatal is "+(s1+s2+s3+s4));
			
		}


		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter x and y");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			Caluculator obj = new Caluculator();
			int sumres = obj.sum(x,y);
			System.out.println("sum is "+sumres);
			
			int subres = obj.sub(x,y);
			System.out.println("sub is "+subres);
			
			int mulres = obj.mul(x,y);
			System.out.println("mul is "+mulres);
			
			int divres = obj.div(x,y);
			System.out.println("div is "+divres);
			
			
			obj.findTotal(10,20,30,40);
			
		}


}