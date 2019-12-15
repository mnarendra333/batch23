package com.pragim.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pragim.onetomany.model.Customer;
import com.pragim.onetomany.model.Vendor;
import com.pragim.onetomany.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        Customer c1 = new Customer();
        c1.setCustId(101);
        c1.setCustName("Infy");
        c1.setLocation("bangl");
        
        Customer c2 = new Customer();
        c2.setCustId(102);
        c2.setCustName("Capgemini");
        c2.setLocation("bangl");
        
        
        Set<Customer> custList = new HashSet<Customer>();
        custList.add(c1);
        custList.add(c2);
        
        
        Vendor v = new Vendor();
        v.setVenId(1);
        v.setVenName("CISCO");
        v.setLocation("bangl");
        v.setCustomerList(custList);
        
        Transaction tx = session.beginTransaction();
        session.save(v);
        
        tx.commit();
        
    }
}
