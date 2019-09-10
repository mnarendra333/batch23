class Person
{
	//variable declaration
	private int id;
	private String name;
	private String address;
	
	//constructor
	public Person(int id, String name, String address)
	{
		
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	//methods
	public void doWork()
	{
		Computer obj = new Computer();
		obj.useComputer();	
		
	}
	public static void main(String args[])
	{
		Person p = new Person(101,"kumar","bangl");
		p.doWork();

		
	}
	


}