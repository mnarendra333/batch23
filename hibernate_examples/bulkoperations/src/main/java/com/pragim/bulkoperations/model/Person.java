package com.pragim.bulkoperations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stu_generator")
	@SequenceGenerator(name="stu_generator", sequenceName = "per_seq", allocationSize=1)
	private int id;
	@Column(length=30)
	private String name;
	@Column(length=30)
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
