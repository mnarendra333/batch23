package com.pragim.springfirstapp;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    		Resource res = new ClassPathResource("spring.xml");
    		//create spring container
    		
    		BeanFactory factory = new XmlBeanFactory(res);
    		HelloWorldBean bean = factory.getBean("id1",HelloWorldBean.class);
    		bean.printMsg();
    	
    	
    }
}
