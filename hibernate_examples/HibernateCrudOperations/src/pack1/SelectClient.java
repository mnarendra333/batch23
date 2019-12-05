package pack1;

import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		try {
			
			FileInputStream fis = new FileInputStream("db.properties");
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml").addProperties(props);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		
		Metadata metadata = new MetadataSources(serviceRegistry)
				 .addAnnotatedClass(Orders.class ) 
				 .getMetadataBuilder()
				 .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE )
				 .build();
		
		 SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Orders orders1 = session.get(Orders.class, 10002l);
		
		Orders orders2 = session.get(Orders.class, 10002l);

	}

}
