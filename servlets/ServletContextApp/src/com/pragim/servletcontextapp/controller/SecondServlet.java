package com.pragim.servletcontextapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {

			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");

			ServletContext ctx = getServletContext();
			String driverCN = ctx.getInitParameter("driverClassName");
			
			String url = ctx.getInitParameter("url");
			String uname = ctx.getInitParameter("username");
			String pwd = ctx.getInitParameter("password");

			Class.forName(driverCN);
			Connection connection = DriverManager.getConnection(url, uname, pwd);

			if (connection != null)
				out.println("<h2>DB Connection successful!!");
			else
				out.println("<h2>DB Connection not successful!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
