package com.pragim.cricketapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pragim.cricketapp.dao.TeamsDaoImpl;
import com.pragim.cricketapp.model.TeamInfo;

/**
 * Servlet implementation class TeamsController
 */
@WebServlet("/teamssrv")
public class TeamsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		TeamsDaoImpl dao = new TeamsDaoImpl();
		List<TeamInfo> teams = dao.getTeams();
		request.setAttribute("teamsData", teams);
		
		//logic to navigate to jsp file to display teams info
		
		RequestDispatcher rd = request.getRequestDispatcher("displayTeams.jsp");
		rd.forward(request, response);
		
	}

}
