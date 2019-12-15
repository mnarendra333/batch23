package com.pragim.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.onetoone.model.Address;
import com.pragim.onetoone.model.Student;
import com.pragim.onetoone.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	
    	
    	Address addr = new Address();
    	addr.setStreet("MGRoad");
    	addr.setCity("bangl");
    	addr.setState("KA");
    	addr.setCountry("India");
    	addr.setZipCode(560037);
    	
    	Student student = new Student();
    	student.setName("Ravi");
    	student.setColName("NewHorizon");
    	student.setAddress(addr);
    	
    	
    	Transaction tx = session.beginTransaction();
    	session.save(student);
    	tx.commit();
    
    
    }
}
