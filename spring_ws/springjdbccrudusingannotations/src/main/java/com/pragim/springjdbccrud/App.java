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
        SpringJdbcBean bean = ctx.getBean("springJdbcBean",SpringJdbcBean.class);
       // bean.saveSeller();
        //bean.updateSeller(5, "chenni");
        
        //bean.deleteSeller("HindustanElc");
       // bean.findAll();
       // bean.selectUsingResultSetExt();
       // bean.queryWithResultSetExtUsingNewClass();
        //bean.queryDataUsingRowMapper();
        bean.selectData();
    }
}
