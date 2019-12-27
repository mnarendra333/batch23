package com.pragim.autowiringusingannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//String[] beanNamesForType = factory.getBeanNamesForType(TVBean.class);
    	//System.out.println(beanNamesForType[0]);
    	TVBean bean = factory.getBean("TVBean",TVBean.class);
    	bean.start();
    	
    	//Remote bean = factory.getBean("remote",Remote.class);
    	//bean.powerOn();
    	
    }
}
