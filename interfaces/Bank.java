interface Bank
{
	int x=50;
	void withdrawl();
	void balanceEnquiry();
	void miniStatement();
	void deposit();
	
}
class SBI implements Bank
{
	public void withdrawl()
	{	
		System.out.println("SBI=> withdrawl");	
	}
	public void balanceEnquiry()
	{
		System.out.println("SBI=> balanceEnquiry");
		
	}
	public void miniStatement()
	{
		System.out.println("SBI=> miniStatement");
		
	}
	public void deposit()
	{
		System.out.println("SBI=> deposit");
		
	}
	public static void main(String args[])
	{
		Bank obj1 = new HDFC();
		obj1.withdrawl();
		obj1.balanceEnquiry();
		obj1.miniStatement();
		obj1.deposit();	
	}
}
class HDFC implements Bank
{
	
	public void withdrawl()
	{
		
		System.out.println("HDFC=> withdrawl");
		
	}
	public void balanceEnquiry()
	{
		System.out.println("HDFC=> balanceEnquiry");
		
	}
	public void miniStatement()
	{
		System.out.println("HDFC=> miniStatement");
		
	}
	public void deposit()
	{
		System.out.println("HDFC=> deposit");
		
	}
	

	
}