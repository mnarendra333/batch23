class FinalDemo
{

	final int x = 10;


	public void changeFinalValue()
	{
		//it should throw compilation error
		x = 50;
		
	}

	public static void main(String args[])
	{
		
		FinalDemo obj = new FinalDemo();
		obj.changeFinalValue();
		
	}


}