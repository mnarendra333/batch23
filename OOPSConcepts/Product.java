class Product
{

	int pid;
	String proName;
	double prize;
	static String sellerName = "WsRet";
	
	public Product(int pid, String proName, double prize)
	{
		
		this.pid = pid;
		this.proName = proName;
		this.prize = prize;
		
	}
	
	double getProductPrizeAfterDiscount()
	{
		int discount = 10;
		double disValue = this.prize*discount/100;
		return prize - disValue;
	}
	
	public static void invokeStaticMethod()
	{
		System.out.println(sellerName);
	}
	
	public void displayLocalVar(){
		//System.out.println(discount); == we can't access local variable outside
		//of the method
		System.out.println(sellerName);
		
	}
	
	public Product()
	{
		
	}
	public static void main(String args[])
	{
		//static varibles are accessed through Classname.variable name
		System.out.println("sellerName is "+Product.sellerName);
		Product p1 = new Product(101,"Dell",56000);
		System.out.println(p1.pid+" "+p1.proName+" "+p1.prize);
		System.out.println("sellerName is "+p1.sellerName);
		
		Product p2 = new Product(102,"Hp",45000);
		System.out.println(p2.pid+" "+p2.proName+" "+p2.prize);
		
		double prize = p2.getProductPrizeAfterDiscount();
		System.out.println(prize);
		
		p2.displayLocalVar();
		
		Product.invokeStaticMethod();
	}

}