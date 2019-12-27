package com.pragim.springjdbccrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        SpringJdbcBean bean = ctx.getBean("id1",SpringJdbcBean.class);
       // bean.saveSeller();
        //bean.updateSeller(5, "chenni");
        
        //bean.deleteSeller("HindustanElc");
        bean.findAll();
    }
}
