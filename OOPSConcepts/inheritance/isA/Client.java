class Client
{


		public static void main(String args[])
		{
			
			Student obj = new Student(101,"Surya",500);
			
			System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getMarks());
			
			
			Employee obj2 = new Employee(200,"John",70000);
			System.out.println(obj2.getId()+" "+obj2.getName()+" "+obj2.getSal());
			
		}


}