package pack1;

public class InherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address stuAddr = new Address("PragathiNagar", "1/456", "bangl", "KA");
		Student s1 = new Student(101, "ravi", 500,stuAddr);
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getMarks());
		Address address = s1.getAddress();
		System.out.println(address.getCity());
		
		
		Address empAddr = new Address("PragathiNagar", "1/123", "chenni", "TN");
		Employee e1 = new Employee(10001, "John", 50000,empAddr);
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSal());
		Address address2 = e1.getAddress();
		System.out.println(address2.getCity());
		
	}

}
