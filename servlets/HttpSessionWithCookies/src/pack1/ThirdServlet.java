package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/srv3")
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//collect form data
		
		String[] cites = request.getParameterValues("city");
		String sal = request.getParameter("sal");
		
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		String age = (String)session.getAttribute("age");
		String phoneno = (String)session.getAttribute("phoneno");
		String gen = (String)session.getAttribute("gen");
		String emailId = (String)session.getAttribute("emailId");
		String degName = (String)session.getAttribute("degName");
		String college = (String)session.getAttribute("college");
		String univ = (String)session.getAttribute("univ");
		String marks = (String)session.getAttribute("marks");
		
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		out.println(name+" "+age+" "+phoneno+" "+gen);
		
		out.println(sal);
		
	}

}
