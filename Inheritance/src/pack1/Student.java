package pack1;

public class Student extends Person {

	private Address address;
	
	private double marks;

	public Student(int id, String name, double marks, Address address) {
		super(id, name);
		this.marks = marks;
		this.address = address;
	}

	public double getMarks() {
		return marks;
	}

	public Address getAddress() {
		return address;
	}
	
	

}
