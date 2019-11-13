package com.pragim.cookies.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/srv2")
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
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//collect form data
		String skill = request.getParameter("skill");
		String age = request.getParameter("age");
		
		out.println("skills are "+skill);
		out.println("age "+age);
		
		//collect cookie
		Cookie[] cookies = request.getCookies();
		if(cookies!=null && cookies.length>0)
		{
			for (Cookie cookie : cookies) {
				out.println(cookie.getName()+" "+cookie.getValue());
			}
		}
	}

}
