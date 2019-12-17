package com.pragim.manytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	private int stuId;
	private String name;
	private String addr;

	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=Course.class)
	@JoinTable(name="student_courses", joinColumns = { 
			@JoinColumn(name = "stu_id", nullable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "course_id", 
					nullable = false) })
	private Set<Course> courseList;

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Set<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(Set<Course> courseList) {
		this.courseList = courseList;
	}

}
