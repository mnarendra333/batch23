public class Employee extends Person
{

	private double sal;
	
	public Employee(int id, String name, double sal)
	{
		super(id,name);
		this.sal = sal;
		
		
	}
	
	public double getSal()
	{
		
		return sal;
	}

}