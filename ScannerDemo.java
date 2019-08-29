import java.util.Scanner;
class ScannerDemo
{
	public static void main(String args[])
	{
		
		
		//int a = 10, b = 20;
		
		//int a = Integer.parseInt(args[0]);
		//int b = Integer.parseInt(args[1]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = a+b;
		
		System.out.println("sum is "+res);
		
		
	}


}