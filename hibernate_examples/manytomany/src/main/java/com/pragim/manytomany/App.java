package com.pragim.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.manytomany.entity.Course;
import com.pragim.manytomany.entity.Student;
import com.pragim.manytomany.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = HibernateUtil.getSessionFactory();
       Session session = factory.openSession();
       
       Course c1 = new Course();
       c1.setCourseId(101);
       c1.setCourseName("JAVA");
       c1.setDuration(100);
       
       Course c2 = new Course();
       c2.setCourseId(102);
       c2.setCourseName("HTML");
       c2.setDuration(30);
       
       Course c3 = new Course();
       c3.setCourseId(103);
       c3.setCourseName("Angular");
       c3.setDuration(60);
       
       
       Set<Course> courseList = new HashSet<Course>();
       courseList.add(c1);
       courseList.add(c2);
       courseList.add(c3);
       
       
       
       Student student = new Student();
       student.setStuId(1);
       student.setName("Surya");
       student.setAddr("bangl");
       student.setCourseList(courseList);
       
       
       Transaction tx = session.beginTransaction();
       session.save(student);
       tx.commit();
       
       
       
    }
}
