package com.pragim.springmvccrudapp.model;

public class Product {

	private int proId;
	private String proName;
	private double price;
	private String proDesc;

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProDesc() {
		return proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", price="
				+ price + ", proDesc=" + proDesc + "]";
	}
	
	
	

}
