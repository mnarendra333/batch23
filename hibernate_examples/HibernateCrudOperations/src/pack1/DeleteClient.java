package pack1;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Orders orders = session.load(Orders.class, 10002l);
		System.out.println(orders.getRestarentName());
		if(orders!=null)
			session.delete(orders);
		
		session.beginTransaction().commit();

	}

}
