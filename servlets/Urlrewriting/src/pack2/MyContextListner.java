package pack2;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyContextListner
 *
 */
@WebListener
public class MyContextListner implements ServletContextListener {

	long startTime,endTime;
	
    public MyContextListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ServletContext ctx = sce.getServletContext();
    	//servletContext.setAttribute(name, object);
    	
    	endTime = System.currentTimeMillis();
    	ctx.log("application is killed at "+endTime);
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	ServletContext ctx = sce.getServletContext();
    	//servletContext.setAttribute(name, object);
    	
    	startTime = System.currentTimeMillis();
    	ctx.log("application started at "+startTime);
    }
	
}
