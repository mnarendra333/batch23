package com.pragim.bulkoperations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pragim.bulkoperations.model.Person;

public class HQLWhereClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city and char");
		String loc = sc.next();
		String input = sc.next();
		Query query = session.createQuery
				("select p from Person p where p.name like :char and p.address=:addr");
		query.setParameter("addr", loc);
		query.setParameter("char", input);
		List<Person> list = query.list();
		System.out.println(list);

	}

}
