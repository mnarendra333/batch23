package com.pragim.mycricketapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pragim.mycricketapp.model.TeamInfo;
import com.pragim.mycricketapp.util.HibernateUtil;

public class TeamsHibernateDaoImpl {

	public List<TeamInfo> getTeams() {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("from TeamInfo");
		List<TeamInfo> list = query.list();
		return list;
	}

	public String deleteTeam(int teamId) {
		String message = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		TeamInfo teamInfo = session.get(TeamInfo.class, teamId);
		if (teamInfo != null) {
			session.delete(teamInfo);
			message = "Team deleted successfully";
		}
		return message;
	}

	public String addTeam(String teamName, String city, String captain, String ambassadar) {
		String message = null;

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		TeamInfo obj = new TeamInfo();
		obj.setTeamName(teamName);
		obj.setCity(city);
		obj.setCaptain(captain);
		obj.setAmbassadar(ambassadar);

		Transaction tx = session.beginTransaction();
		Integer save = (Integer) session.save(obj);

		tx.commit();

		if (save != null) {
			message = "Team saved successfully";
		}
		return message;
	}

	public TeamInfo getTeamById(int teamId) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		TeamInfo teamInfo = session.get(TeamInfo.class, teamId);
		return teamInfo;
	}

	public String updateTeam(String id, String teamName, String city, String captain, String ambassadar) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		int teamId = Integer.parseInt(id);
		TeamInfo obj = session.get(TeamInfo.class, teamId);
		obj.setTeamName(teamName);
		obj.setCity(city);
		obj.setCaptain(captain);
		obj.setAmbassadar(ambassadar);
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		return "Team updated successfully";
	}

}
