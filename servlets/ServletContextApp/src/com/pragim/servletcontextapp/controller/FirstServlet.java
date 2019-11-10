package com.pragim.servletcontextapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		try {

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");

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
