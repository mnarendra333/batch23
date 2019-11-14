package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String phoneno = request.getParameter("phno");
			String gen = request.getParameter("gender");
			String emailId = request.getParameter("email");
			
			
			HttpSession session = request.getSession();
			System.out.println(session.getId());
			session.setAttribute("name", name);
			session.setAttribute("age", age);
			session.setAttribute("phoneno", phoneno);
			session.setAttribute("gen", gen);
			session.setAttribute("emailId", emailId);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("edu.html");
			rd.include(request, response);
	}

}
