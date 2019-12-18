package com.pragim.manytomany;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pragim.manytomany.entity.Course;
import com.pragim.manytomany.entity.Student;
import com.pragim.manytomany.util.HibernateUtil;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Course course = session.get(Course.class, 101);
		System.out.println(course.getCourseName()+" "+course.getDuration());
		
		Set<Student> studentList = course.getStudentList();
		System.out.println(studentList);
		
		System.out.println("============================================");
		Student student = session.get(Student.class, 4);
		System.out.println(student.getName()+" "+student.getAddr());
		
		Set<Course> courseList = student.getCourseList();
		for (Course course2 : courseList) {
			System.out.println(course2);
		}
	}

}
