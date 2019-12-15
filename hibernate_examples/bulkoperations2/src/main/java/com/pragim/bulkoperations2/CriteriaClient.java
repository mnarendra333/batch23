package com.pragim.bulkoperations2;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.pragim.bulkoperations2.model.Product;

public class CriteriaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		
		
		Criteria criteria = session.createCriteria(Product.class);
		System.out.println(criteria.getClass());
		List<Product> list = criteria.list();
		for (Product product : list) {
			System.out.println(product);
		}
		
		
		System.out.println("==============================");
		Criteria criteria2 = session.createCriteria(Product.class);
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("productName"));
		projectionList.add(Projections.property("price"));
		
		criteria2.setProjection(projectionList);
		
		List<Object[]> list2 = criteria2.list();
		
		for (Object[] objects : list2) {
			for (Object objects2 : objects) {
				System.out.print(objects2+" ");
			}
			System.out.println();
		}
		
		
		
		Criteria criteria3 =session.createCriteria(Product.class);
		List<String> list3 = criteria3.setProjection(Projections.property("productName")).list();
		for (String string : list3) {
			System.out.println(string);
		}

	}

}
