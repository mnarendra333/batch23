package com.pragim.cricketapp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pragim.cricketapp.model.TeamInfo;
import com.pragim.cricketapp.util.ConnectionUtility;

public class TeamsDaoImpl {
	
	
	
	public List<TeamInfo>  getTeams(){
		List<TeamInfo> list = null;
		try {
			Connection connection = ConnectionUtility.getConnectionFromOracle();
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
		return list;
	}

}
