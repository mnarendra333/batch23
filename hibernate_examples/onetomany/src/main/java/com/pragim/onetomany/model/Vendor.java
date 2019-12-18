package com.pragim.onetomany.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
public class Vendor {
	@Id
	private int venId;
	private String venName;
	private String location;

	
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Customer.class,orphanRemoval=true)
	@JoinColumn(name="vendor_id")
	@Fetch(FetchMode.SELECT)
	private Set<Customer> customerList;

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Set<Customer> customerList) {
		this.customerList = customerList;
	}

}
