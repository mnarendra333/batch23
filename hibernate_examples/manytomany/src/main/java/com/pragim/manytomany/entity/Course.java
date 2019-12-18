package com.pragim.manytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Course {
	@Id
	private int courseId;
	private String courseName;
	private int duration;

	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=Student.class)
	@JoinTable(name="student_courses", joinColumns = { 
			@JoinColumn(name = "course_id", nullable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "stu_id", 
					nullable = false) })
	private Set<Student> studentList;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Set<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Set<Student> studentList) {
		this.studentList = studentList;
	}

}
