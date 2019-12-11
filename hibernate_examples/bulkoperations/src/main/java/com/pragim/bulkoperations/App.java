package com.pragim.bulkoperations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.bulkoperations.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	
    	Session session = new Configuration().configure().buildSessionFactory().openSession();
    	
    	
    	
    	Person person = new Person();
    	person.setName("sunil");
    	person.setAddress("chenni");
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(person);
    	
    	tx.commit();
    
    
    
    }
}
