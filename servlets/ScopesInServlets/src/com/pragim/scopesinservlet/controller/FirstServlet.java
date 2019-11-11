package com.pragim.scopesinservlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			//retrive client data into servlet
		
			String username = request.getParameter("uname");

			String age = request.getParameter("age");

			String city = request.getParameter("city");
			
			
			
			//set the above params into request scope
			request.setAttribute("req_uname", username);
			request.setAttribute("req_age", age);
			request.setAttribute("req_city", city);
			
			

			//set the above params into session scope
			HttpSession session = request.getSession();
			
			session.setAttribute("ses_uname", username);
			session.setAttribute("ses_age", age);
			session.setAttribute("ses_city", city);
			
			//session.invalidate();
			
			//set the above params into context scope
			ServletContext ctx = getServletContext();
			
			ctx.setAttribute("ctx_uname", username);
			ctx.setAttribute("ctx_age", age);
			ctx.setAttribute("ctx_city", city);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/srv2");
			rd.forward(request, response);
			
			
		
	}

}
