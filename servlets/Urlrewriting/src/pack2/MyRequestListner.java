package pack2;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyRequestListner
 *
 */
@WebListener
public class MyRequestListner implements ServletRequestListener {

	long startTime,endTime;
    /**
     * Default constructor. 
     */
    public MyRequestListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	endTime = System.currentTimeMillis();
    	 ServletContext ctx = sre.getServletContext();
    	 ctx.log("request destroyed at "+endTime);
    	 ctx.log("request processing time is "+(endTime- startTime));
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	
    	 startTime = System.currentTimeMillis();
    	 
    	 ServletContext ctx = sre.getServletContext();
    	 ctx.log("request created at "+startTime);
    	 
    }
	
}
