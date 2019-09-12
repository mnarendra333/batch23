class Student
{
	
	
	private int id;
	private String name;
	private int marks;
	
	
	public Student(int p1, String p2, int p3)
	{
		
		id = p1;
		name = p2;
		marks = p3;
		
		
	}
	
	
	public String toString()
	{
		
		
		return id+" "+name+" "+marks;
	}
	
	
	public static void main(String args[])
	{
		
		Object obj1 = new Student(101,"ravi",500);
		System.out.println(obj1.toString());
		
		
	}



}