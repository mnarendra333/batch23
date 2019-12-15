package com.pragim.bulkoperations3;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.pragim.bulkoperations3.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	
    	NativeQuery nativeQuery = session.createSQLQuery
 ("select * from seller where sellername like :selName").setParameter("selName", "W%");
    	List<Object[]> list = nativeQuery.list();
    	
    	for (Object[] objects : list) {
			for (Object object : objects) {
				System.out.print(object+" ");
			}
    		//System.out.println(objects[0]+" "+objects[1]+" "+objects[2]);
			System.out.println();
		}
    	
    }
}
