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
		
		
		String degName = request.getParameter("degName");
		String college = request.getParameter("colName");
		String univ = request.getParameter("univ");
		String marks = request.getParameter("marks");
		
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		
		
		session.setAttribute("degName", degName);
		session.setAttribute("college", college);
		session.setAttribute("univ", univ);
		session.setAttribute("marks", marks);
		
		RequestDispatcher rd = request.getRequestDispatcher("pref.jsp");
		rd.include(request, response);
		
		
		
		
	}

}
