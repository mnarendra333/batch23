package com.pragim.hiddenformfields.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/srv1")
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
		// TODO Auto-generated method stub
		
		
			String username = request.getParameter("uname");
			String teamName = request.getParameter("teamName");
			
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			
			out.println("<form action=srv2 method=post><table>");
			out.println("<input type=hidden name=uname value="+username+">");
			out.println("<input type=hidden name=teamName value="+teamName+">");
			out.println("<tr><td>Skill</td><td><select name=skill><option>bowler</option>");
			out.println("<option>batsmen</option><option>all-rounder</option></select></td></tr>");
			out.println("<tr><td>Age</td><td><input type=text name=age></td></tr>");
			out.println("<tr><td><input type=submit></td></tr></table></form>");
			
			
			
			
			
			
	}

}
