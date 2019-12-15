package com.pragim.mycricketapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pragim.mycricketapp.dao.TeamsDaoImpl;
import com.pragim.mycricketapp.dao.TeamsHibernateDaoImpl;
import com.pragim.mycricketapp.model.TeamInfo;

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
		
		
			int teamId = 0;
		//	TeamsDaoImpl dao = new TeamsDaoImpl();
			TeamsHibernateDaoImpl dao = new TeamsHibernateDaoImpl();
			String id = request.getParameter("id");
			if(id!=null)
				teamId = Integer.parseInt(id);
			
			String btnName = request.getParameter("btnName");
			
			if("delete".equalsIgnoreCase(btnName)) {
				String message = dao.deleteTeam(teamId);
				request.setAttribute("msg", message);
			}
			if("add".equalsIgnoreCase(btnName)) {
				String teamName = request.getParameter("teamName");
				String city = request.getParameter("city");
				String captain = request.getParameter("captain");
				String ambassadar = request.getParameter("ambassadar");
				
				
				
				String message = dao.addTeam(teamName,city,captain,ambassadar);
				request.setAttribute("msg", message);
			}
			
			if("edit".equalsIgnoreCase(btnName)) {
				TeamInfo teamObj = dao.getTeamById(teamId);
				request.setAttribute("teamObject", teamObj);
			}
			
			if("update".equalsIgnoreCase(btnName)) {
				String teamName = request.getParameter("teamName");
				String city = request.getParameter("city");
				String captain = request.getParameter("captain");
				String ambassadar = request.getParameter("ambassadar");
				
				
				
				String message = dao.updateTeam(id,teamName,city,captain,ambassadar);
				request.setAttribute("msg", message);
			}
			
			
			List<TeamInfo> teams = dao.getTeams();
			
			request.setAttribute("myteams", teams);
			
			RequestDispatcher rd = request.getRequestDispatcher("displayTeams.jsp");
			rd.forward(request, response);
	}

}
