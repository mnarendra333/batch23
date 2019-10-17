package pack1;

public class Employee extends Person {

	private double sal;

	private Address address;

	public Employee(int id, String name, double sal, Address address) {
		super(id, name);
		this.sal = sal;
		this.address = address;
	}

	public double getSal() {
		return sal;
	}

	public Address getAddress() {
		return address;
	}

}
