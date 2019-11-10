package com.pragim.servletconfig.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbServlet
 */
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
try {
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
	
			ServletConfig config = getServletConfig();
			String driverCN = config.getInitParameter("driverClassName");
			String url = config.getInitParameter("url");
			String uname = config.getInitParameter("username");
			String pwd = config.getInitParameter("password");
			
			
			Class.forName(driverCN);
			Connection connection = DriverManager.getConnection(url,uname,pwd);
			
			if(connection!=null)
				out.println("<h2>DB Connection successful!!");
			else
				out.println("<h2>DB Connection not successful!!");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
