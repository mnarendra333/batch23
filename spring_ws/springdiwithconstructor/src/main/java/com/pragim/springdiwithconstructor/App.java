package com.pragim.springdiwithconstructor;

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
    	Traveller bean = factory.getBean("id4",Traveller.class);
    	bean.startJourney();
    	
    }
}
