package com.pragim.bulkoperations2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pragim.bulkoperations2.model.Product;

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
    	
    	
    	Query query1 = session.createQuery("from Product");
    	List<Product> list = query1.list();
    	for (Product product : list) {
			System.out.println(product);
		}
    	
    	
    	Query query2 = session.createQuery("select p.productName,p.price from Product p");
    	List<Object[]> list2 = query2.list();
    	
    	for (Object[] objects : list2) {
			System.out.println(objects[0]+" "+objects[1]);
		}
    	
    	Query query3 = session.createQuery("select p.productName from Product p");
    	List<String> list3 = query3.list();
    	
    	for (String string : list3) {
			System.out.println(string);
		}
    	
    	
    }
}
