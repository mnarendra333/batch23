package com.set;

public class Employee implements Comparable<Employee>{

	
	
	private int id;
	private String name;
	private double sal;
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}


	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public int compareTo(Employee o) {
//		int id1 = this.getId();
//		int id2 = o.getId();
//		return id1<id2?-1:id1>id2?1:0;
		
		
//		String s1 = this.getName();
//		String s2 = o.getName();
//		return s1.compareTo(s2);
		
		
//		double d1 = this.getSal();
//		double d2 = o.getSal();
//		return d1<d2?-1:d1>d2?1:0;
		//or
		Double d1 = this.getSal();
		Double d2 = o.getSal();
		
		return -d1.compareTo(d2);
	}
	
	
	
	
	
	
	
	
	

}
