package com.pragim.bulkoperations3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pragim.bulkoperations3.model.Seller;
import com.pragim.bulkoperations3.util.HibernateUtil;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	Seller seller = session.get(Seller.class, 2);
    	Seller seller2 = session.get(Seller.class, 2);
    	session.close();
    	Session session2 = sessionFactory.openSession();
    	Seller seller3 = session2.get(Seller.class, 2);
    	

	}

}
