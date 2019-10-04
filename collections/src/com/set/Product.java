package com.set;

public class Product implements Comparable<Product>{
	
	private int proId;
	private String proName;
	private double price;
	
	
	public Product(int proId, String proName, double price) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.price = price;
	}
	
	public String toString() {
		return "[" + proId +" "+proName+" "+price+" ]";
	}


	public int getProId() {
		return proId;
	}


	public String getProName() {
		return proName;
	}


	public double getPrice() {
		return price;
	}


	@Override
	public int compareTo(Product ob) {
		String p1 = this.getProName();
		String p2 = ob.getProName();
		return -p1.compareTo(p2);
	}
	
	
	
	
	

}
