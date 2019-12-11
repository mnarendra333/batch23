package com.pragim.bulkoperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pragim.bulkoperations.model.Person;

public class SelectClient {

	public static void main(String[] args) {
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		//approch-1 [selecting full object]
		//Query query = session.createQuery("from Person");
		System.out.println("=================================");
		Query query1 = session.createQuery("from Person p");
		List<Person> list = query1.list();
		
		for (Person person : list) {
			System.out.println(person);
		}
		
		//approch-2 [partial object selection]
		System.out.println("===================================");
		Query query2 = session.createQuery("select p.name,p.address from Person p");
		List<Object[]> list2 = query2.list();
		for (Object[] objects : list2) {
			System.out.println(objects[0]+" "+objects[1]);
		}
		
		//approch-3 [one column selection]
		System.out.println("===================================");
		
		Query query = session.createQuery("select p.name from Person p");
		List<String> list3 = query.list();
		for (String string : list3) {
			System.out.println(string);
		}

	}

}
