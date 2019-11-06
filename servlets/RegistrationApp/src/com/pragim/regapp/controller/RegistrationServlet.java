package com.pragim.regapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
		String gen = request.getParameter("gender");
		String emailAddr = request.getParameter("email");
		
		String phoneNo = request.getParameter("phno");
		
		String dateOfBirth = request.getParameter("dob");
		
		String city = request.getParameter("city");
		
		String[] hobbies = request.getParameterValues("hobbies");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < hobbies.length; i++) {
			
			sb.append(hobbies[i]);
			if(i!=hobbies.length-1)
				sb.append(",");
		}
		
//		for (String string : hobbies) {
//			sb.append(string).append(",");
//		}
		
		String address = request.getParameter("addr");
		
		
		
		String fullName = firstName+lastName;
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println(firstName+"\n"+lastName+"\n"+gen+"\n"+emailAddr+"\n"+phoneNo+"\n"
				+dateOfBirth+"\n"+city+"\n"+hobbies[0]+"\n"+address);
		
		
		//code to insert data into database - jdbc
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			
			PreparedStatement pstmt = connection.prepareStatement("insert into reg_tab_data values(regi_sequ.nextval,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, fullName);
			pstmt.setString(2, gen);
			pstmt.setString(3, emailAddr);
			pstmt.setString(4, phoneNo);
			pstmt.setString(5, dateOfBirth);
			pstmt.setString(6, city);
			pstmt.setString(7, sb.toString());
			pstmt.setString(8, address);
			int count = pstmt.executeUpdate();
			pw.println("<h1><font color='green'>Registration completed successfully!!!!</font></h1>");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
