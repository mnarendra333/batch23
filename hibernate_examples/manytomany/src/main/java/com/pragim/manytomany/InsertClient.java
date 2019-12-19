package com.pragim.manytomany;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.manytomany.entity.Course;
import com.pragim.manytomany.entity.Student;
import com.pragim.manytomany.util.HibernateUtil;

public class InsertClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Student student1 = new Student();
		student1.setStuId(1);
		student1.setName("sai");
		student1.setAddr("bangl");

		Student student2 = new Student();
		student2.setStuId(4);
		student2.setName("krishna");
		student2.setAddr("bangl");

		Student student3 = new Student();
		student3.setStuId(5);
		student3.setName("nikhil");
		student3.setAddr("bangl");
		
	

		Set<Student> stuList = new LinkedHashSet<Student>();
		stuList.add(student1);
		stuList.add(student2);
		stuList.add(student3);

		Course course = new Course();
		course.setCourseId(101);
		course.setCourseName("JAVA");
		course.setDuration(100);
		course.setStudentList(stuList);
		
		Transaction tx = session.beginTransaction();
		session.persist(course);
		tx.commit();

	}

}
