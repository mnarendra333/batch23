package com.set.util;

import java.util.Comparator;

import com.set.model.Student;

public class StudentComprator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
//		int i1 = o1.getId();
//		int i2 = o2.getId();
//		return i1<i2?-1:i1>i2?1:0;
		
		Integer i1 = o1.getId();
		Integer i2 = o2.getId();
		return -i2.compareTo(i1);
	}
	
	
}
