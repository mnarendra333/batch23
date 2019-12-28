package com.pragim.springjdbccrud.model;

public class Seller {

	private int selId;
	private String selName;
	private String location;

	public int getSelId() {
		return selId;
	}

	public void setSelId(int selId) {
		this.selId = selId;
	}

	public String getSelName() {
		return selName;
	}

	public void setSelName(String selName) {
		this.selName = selName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Seller [selId=" + selId + ", selName=" + selName + ", location=" + location + "]";
	}
	
	

}
