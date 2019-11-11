package com.pragim.scopesinservlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = response.getWriter();

		// fetch req data
		String req_uname = (String) request.getAttribute("req_uname");
		String req_age = (String) request.getAttribute("req_age");
		String req_city = (String) request.getAttribute("req_city");

		pw.println("req data \n" + req_uname + "\n" + req_age + "\n" + req_city);

		// fetch session data
		HttpSession session = request.getSession();
		String ses_uname = (String) session.getAttribute("ses_uname");
		String ses_age = (String) session.getAttribute("ses_age");
		String ses_city = (String) session.getAttribute("ses_city");

		pw.println("session data \n" + ses_uname + "\n" + ses_age + "\n" + ses_city);
		// fetch context data

		ServletContext ctx = getServletContext();
		String ctx_uname = (String) ctx.getAttribute("ctx_uname");
		String ctx_age = (String) ctx.getAttribute("ctx_age");
		String ctx_city = (String) ctx.getAttribute("ctx_city");
		pw.println("context data \n" + ctx_uname + "\n" + ctx_age + "\n" + ctx_city);
	}

}
