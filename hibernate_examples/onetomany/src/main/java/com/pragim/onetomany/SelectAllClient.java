package com.pragim.onetomany;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pragim.onetomany.model.Customer;
import com.pragim.onetomany.model.Vendor;
import com.pragim.onetomany.util.HibernateUtil;

public class SelectAllClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("from Vendor");
		List<Vendor> list = query.list();
		for (Vendor vendor : list) {
			System.out.println(vendor.getVenId()+" "+vendor.getVenName()+" "+vendor.getLocation());
		//	Set<Customer> customerList = vendor.getCustomerList();
			/*
			 * for (Customer customer : customerList) { System.out.println(customer); }
			 */
		}
		

	}

}
