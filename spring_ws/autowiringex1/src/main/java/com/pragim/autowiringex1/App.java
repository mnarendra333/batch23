package com.pragim.autowiringex1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
    	Person persn = factory.getBean("id2",Person.class);
    	persn.doWork();
    }
}
