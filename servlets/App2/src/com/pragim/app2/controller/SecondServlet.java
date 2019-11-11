package com.pragim.app2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//no="+number+"&square="+square
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		int num = Integer.parseInt(request.getParameter("no"));
		
		String sqValue = request.getParameter("square");
		
		double cube = Math.pow(num, 3);
		
		out.println("<h2>Square value ::</h2> "+sqValue);
		out.println("<h2>Cube value :: </h2>"+cube);
		
		
	}

}
