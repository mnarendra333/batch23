package com.pragim.cricketapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pragim.cricketapp.model.TeamInfo;
import com.pragim.cricketapp.util.ConnectionUtility;

public class TeamsDaoImpl {
	
	
	
	public List<TeamInfo>  getTeams(){
		List<TeamInfo> list = null;
		Connection connection = null;
		try {
		    connection = ConnectionUtility.getConnectionFromOracle();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ipl_teams_data");
			list = new ArrayList<TeamInfo>();
			while (rs.next()) {
				TeamInfo teaminfo = new TeamInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBlob(6));
				list.add(teaminfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public String deleteTeam(int id) {
		// TODO Auto-generated method stub
		String message = null;
		Connection connection = null;
		try {
		    connection = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = connection.prepareStatement("delete from ipl_teams_data where team_id=?");
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			if(count>0)
				message = count+"record deleted successfully and ther list of ids are "+id;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return message;
		
	}
	
	
	public String addTeam(String teamName, String city, String captain, String ambsdr) {
		
		String message = null;
		Connection connection = null;
		try {
			connection = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = connection.prepareStatement("insert into ipl_teams_data (TEAM_ID,TEAM_NAME,CITY,CAPTAIN,AMBASSADER) values(ip_teams_seq.nextval,?,?,?,?)");
			pstmt.setString(1, teamName);
			pstmt.setString(2, city);
			pstmt.setString(3, captain);
			pstmt.setString(4, ambsdr);
			
			int count = pstmt.executeUpdate();
			if(count>0)
				message = teamName+" added successfully ";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return message;
	}

	public TeamInfo getTeamById(int id) {
		TeamInfo teaminfo = null;
		Connection connection = null;
		try {
			connection = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = connection.prepareStatement("select * from ipl_teams_data where team_id=?");
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				teaminfo = new TeamInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBlob(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return teaminfo;
	}

	public String updateTeam(String teamName, String city, String captain, String ambassader, int teamId) {
		String message = null;
		Connection connection = null;
		try {
		    connection = ConnectionUtility.getConnectionFromOracle();
			PreparedStatement pstmt = connection.prepareStatement("update ipl_teams_data set team_name=?,city=?,captain=?,AMBASSADER=? where team_id=?");
			pstmt.setString(1, teamName);
			pstmt.setString(2, city);
			pstmt.setString(3, captain);
			pstmt.setString(4, ambassader);
			pstmt.setInt(5, teamId);
			
			int count = pstmt.executeUpdate();
			if (count>0) {
				message = teamName+"updated successfully";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return message;
	}

	

}
