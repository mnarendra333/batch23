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
		
		int id = 0;
		TeamsDaoImpl dao = new TeamsDaoImpl();
		String btnName = request.getParameter("btnName");
		
		String idValue = request.getParameter("id");
		if(idValue!=null)
			id = Integer.parseInt(idValue);
		
		//logic to navigate to jsp file to display teams info
		
		if("delete".equalsIgnoreCase(btnName)) {
			String message = dao.deleteTeam(id);
			request.setAttribute("msg", message);
			
		}
		
		if("edit".equalsIgnoreCase(btnName)) {
			TeamInfo teamById = dao.getTeamById(id);
			request.setAttribute("teamObj", teamById);
			
		}
		
		if("add".equalsIgnoreCase(btnName)) {
			
			
			String teamName = request.getParameter("teamName");
			String city = request.getParameter("city");
			String captain = request.getParameter("captain");
			String ambassader = request.getParameter("ambassader");
			
			String message = dao.addTeam(teamName, city, captain, ambassader);
			request.setAttribute("msg", message);
		}
		if("update".equalsIgnoreCase(btnName)) {
			
			int teamId = Integer.parseInt(request.getParameter("teamId"));
			String teamName = request.getParameter("teamName");
			String city = request.getParameter("city");
			String captain = request.getParameter("captain");
			String ambassader = request.getParameter("ambassader");
			String message = dao.updateTeam(teamName, city, captain, ambassader, teamId);
			request.setAttribute("msg", message);
		}
		
		//if(btnName!=null || btnName.equalsIgnoreCase("delete"))
		
		
		List<TeamInfo> teams = dao.getTeams();
		request.setAttribute("teamsData", teams);
		
		RequestDispatcher rd = request.getRequestDispatcher("displayTeams.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
