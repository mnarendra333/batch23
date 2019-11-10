package com.pragim.servletconfig.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
		ServletConfig config = getServletConfig();
		
		PrintWriter pw = response.getWriter();
		String driverCN = config.getInitParameter("driverClassName");
		String url = config.getInitParameter("url");
		String uname = config.getInitParameter("username");
		String pwd = config.getInitParameter("password");
		
		pw.println("driverCN "+driverCN);
		pw.println("url "+url);
		pw.println("uname "+uname);
		pw.println("pwd "+pwd);
		
		
		
	}

}
