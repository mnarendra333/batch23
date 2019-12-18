package com.pragim.onetomany;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.onetomany.model.Customer;
import com.pragim.onetomany.model.Vendor;
import com.pragim.onetomany.util.HibernateUtil;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		Vendor vendor = session.get(Vendor.class, 1);
		if(vendor!=null) {
			Set<Customer> customerList = vendor.getCustomerList();
//			
			
			Iterator<Customer> iterator = customerList.iterator();
			while (iterator.hasNext()) {
				Customer customer = iterator.next();
				if(customer.getCustName().equalsIgnoreCase("Infy")) {
					//if("Infy".equalsIgnoreCase(customer.getCustName()))
					iterator.remove();
					break;
				}
			}
			
		}
		tx.commit();
		
		
		

	}

}
