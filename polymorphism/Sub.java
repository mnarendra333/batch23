class Super
{

	public int caluculate(int x)
	{
		
		return  x*x;
	}

}
class Sub extends Super
{
	@Override
	public int caluculate(int x)
	{
		
		return x+x;
	}
	public static void main(String args[])
	{	
		Super obj = new Sub();
		int res = obj.caluculate(10);
		System.out.println(res);
	}

}