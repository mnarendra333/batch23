package com.pragim.hibernatefirstappusingmaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatefirstappusingmaven.model.Department;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	
    	
    	Session session = factory.openSession();
    	
    	Department dept = new Department();
    	dept.setDeptId(102);
    	dept.setDeptName("IT");
    	dept.setDeptCount(100);
    	dept.setColName("NEWHorizon");
    	
    	Transaction tx = session.beginTransaction();
    	session.save(dept);
    	
    	tx.commit();
    	
    	
    }
}
