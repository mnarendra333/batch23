package com.pragim.onetoone.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="stu_info")
public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "per_generator")
		@SequenceGenerator(name="per_generator", sequenceName = "stud_seq", allocationSize=1)
		private int stuId;
		private String name;
		private String colName;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="addr_id")
		private Address address;
		
		
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public int getStuId() {
			return stuId;
		}
		public void setStuId(int stuId) {
			this.stuId = stuId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColName() {
			return colName;
		}
		public void setColName(String colName) {
			this.colName = colName;
		}
		
		
		
}
