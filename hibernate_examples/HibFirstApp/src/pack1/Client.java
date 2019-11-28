package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//load the config file
		
		//step-1
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//step-2
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		//step-3
		Session session = sessionFactory.openSession();
		
		
		//Session openSession = new Configuration().configure().buildSessionFactory().openSession();
		
		
		//step-4 (prepare object)
		Product product = new Product();
		product.setProId(102);
		product.setProName("DEll-5050");
		product.setPrice(76000);
		
		//step-5 - save the object into DB
		Transaction tx = session.beginTransaction();
		session.save(product);
		
		//commit
		tx.commit();
		

	}

}
