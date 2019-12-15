package com.pragim.onetomany.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.pragim.onetomany.model.Customer;
import com.pragim.onetomany.model.Vendor;



public class HibernateUtil {
	
	
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory(){
		
		
		if(sessionFactory == null) {
			
			 try {
	                Configuration configuration = new Configuration();
	                // Hibernate settings equivalent to hibernate.cfg.xml's properties
	                Properties props = new Properties();
	                props.put(Environment.DRIVER, "oracle.jdbc.OracleDriver");
	                props.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
	                props.put(Environment.USER, "system");
	                props.put(Environment.PASS, "system");
	                props.put(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
	                props.put(Environment.SHOW_SQL, "true");
	                props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	                props.put(Environment.HBM2DDL_AUTO, "update");
	                configuration.setProperties(props);
	                configuration.addAnnotatedClass(Vendor.class);
	                configuration.addAnnotatedClass(Customer.class);
	                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties()).build();
	                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
		}
		return sessionFactory;
	}

}
