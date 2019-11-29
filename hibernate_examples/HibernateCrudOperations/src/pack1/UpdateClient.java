package pack1;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class UpdateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Orders orders = session.load(Orders.class, 10001l);
		
		if(orders!=null)
			orders.setPrice(300);
		
		session.update(orders);
		
		session.beginTransaction().commit();
		
	}

}
