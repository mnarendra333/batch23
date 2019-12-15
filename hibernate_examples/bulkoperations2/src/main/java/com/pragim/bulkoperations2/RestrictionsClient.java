package com.pragim.bulkoperations2;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pragim.bulkoperations2.model.Product;

public class RestrictionsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		
		
		Criteria criteria = session.createCriteria(Product.class);
		
		List<Product> list = criteria.add(Restrictions.eq("price", 50000.0)).list();
		for (Product product : list) {
			System.out.println(product);
		}
		
		System.out.println("============================================");
		Criteria criteria2 = session.createCriteria(Product.class);
		
		
		
		Object[] obj = new Object[] {1,2,3};
		
		List<Product> list2 = criteria2.add(Restrictions.in("productId",obj)).list();
		for (Product product : list2) {
			System.out.println(product);
		}
		
		
		
		

	}

}
