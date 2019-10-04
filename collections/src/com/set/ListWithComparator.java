package com.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.set.model.Student;
import com.set.util.StudentComprator;

public class ListWithComparator {
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(101, "ravi", 400);
		Student s2 = new Student(104, "nikhil", 500);
		Student s3 = new Student(102, "raju", 300);
		Student s4 = new Student(103, "surya", 900);
		
		
		Set<Student> stuList = new TreeSet<Student>(new StudentComprator());
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		stuList.add(s4);
		
		System.out.println(stuList);
		
		
	
		
		

	}

}
