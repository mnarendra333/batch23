package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//prepare order
		Orders order = new Orders();
		order.setOrderId(10003);
		order.setFoodName("biriyani");
		order.setRestarentName("Krithunga");
		order.setPrice(250);
		order.setDiscount(10);
		order.setNoofitems(2);
		Transaction tx = session.beginTransaction();
		session.save(order);
		tx.commit();
		

	}

}
