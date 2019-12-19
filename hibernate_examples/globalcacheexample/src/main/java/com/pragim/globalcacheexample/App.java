package com.pragim.globalcacheexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.globalcacheexample.model.Seller;
import com.pragim.globalcacheexample.util.HibernateUtil;

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
    	
    	Seller seller1 = session.get(Seller.class, 2);
    	Seller seller2 = session.get(Seller.class, 2);
    	
    	session.close();
    	
    	Session session2 = sessionFactory.openSession();
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Seller seller3 = session2.get(Seller.class, 2);
    	
    	Seller s = new Seller();
    	s.setSellerid(1000);
    	s.setSellername("ABCD");
    	s.setLocation("bangl");
    	                     
    	Transaction beginTransaction = session2.beginTransaction();
    	session2.save(s);
    	beginTransaction.commit();
    	
    }
}
