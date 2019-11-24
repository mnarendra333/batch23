package com.pragim.mycricketapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pragim.mycricketapp.model.TeamInfo;
import com.pragim.mycricketapp.util.ConnectionUtility;

public class TeamsDaoImpl {
	
	
	
	
		public List<TeamInfo> getTeams(){
			List<TeamInfo> teamList = new ArrayList<TeamInfo>();
			try {
				Connection conn = ConnectionUtility.getConnectionFromOracle(); 
				PreparedStatement ps = conn.prepareStatement("select * from myipl_teams_data");
				ResultSet rs = ps.executeQuery();
				
				while (rs.next()) {
					TeamInfo teamobj = new TeamInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
					teamList.add(teamobj);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return teamList;
		}

		public String deleteTeam(int teamId) {
			List<TeamInfo> teamList = new ArrayList<TeamInfo>();
			String message = null;
			try {
				Connection conn = ConnectionUtility.getConnectionFromOracle(); 
				PreparedStatement ps = conn.prepareStatement("delete from myipl_teams_data where team_id=?");
				ps.setInt(1, teamId);
				int count = ps.executeUpdate();
				if(count>0)
					message = "Team deleted successfully";
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return message;
			
		}

		public String addTeam(String teamName, String city, String captain, String ambassadar) {
			List<TeamInfo> teamList = new ArrayList<TeamInfo>();
			String message = null;
			try {
				Connection conn = ConnectionUtility.getConnectionFromOracle(); 
				PreparedStatement ps = conn.prepareStatement("insert into myipl_teams_data (TEAM_ID,TEAM_NAME,CITY,CAPTAIN,AMBASSADER) values(ipl_teams_seq.nextval,?,?,?,?)");
				ps.setString(1, teamName);
				ps.setString(2, city);
				ps.setString(3, captain);
				ps.setString(4, ambassadar);
				
				int count = ps.executeUpdate();
				if(count>0)
					message = "Team saved successfully";
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return message;
		}

		public TeamInfo getTeamById(int teamId) {
			TeamInfo teamobj = null;
			try {
				Connection conn = ConnectionUtility.getConnectionFromOracle(); 
				PreparedStatement ps = conn.prepareStatement("select * from myipl_teams_data where team_id=?");
				ps.setInt(1, teamId);
				ResultSet rs = ps.executeQuery();
				
				if (rs.next()) {
					 teamobj = new TeamInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return teamobj;
		}

		public String updateTeam(String id, String teamName, String city, String captain, String ambassadar) {
			// TODO Auto-generated method stub
			//update ipl_teams_data set team_name=?,city=?,captain=?,AMBASSADER=? where team_id=?"
			List<TeamInfo> teamList = new ArrayList<TeamInfo>();
			String message = null;
			int teamId = Integer.parseInt(id);
			try {
				Connection conn = ConnectionUtility.getConnectionFromOracle(); 
				PreparedStatement ps = conn.prepareStatement("update myipl_teams_data set team_name=?,city=?,captain=?,AMBASSADER=? where team_id=?");
				ps.setString(1, teamName);
				ps.setString(2, city);
				ps.setString(3, captain);
				ps.setString(4, ambassadar);
				ps.setInt(5, teamId);
				
				int count = ps.executeUpdate();
				if(count>0)
					message = "Team updated successfully";
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return message;
		}

}
