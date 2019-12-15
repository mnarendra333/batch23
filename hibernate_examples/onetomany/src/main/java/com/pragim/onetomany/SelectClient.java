package com.pragim.onetomany;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pragim.onetomany.model.Customer;
import com.pragim.onetomany.model.Vendor;
import com.pragim.onetomany.util.HibernateUtil;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Vendor vendor = session.get(Vendor.class, 1);
		System.out.println(vendor.getVenId()+" "+vendor.getVenName()+" "+vendor.getLocation());
		
		Set<Customer> customerList = vendor.getCustomerList();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}

}
