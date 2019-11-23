package com.pragim.cricketapp.model;

import java.io.Serializable;
import java.sql.Blob;

public class TeamInfo {

	private int teamId;
	private String teamName;

	private String city;

	private String captain;

	private String ambassader;

	private Blob flag;

	public TeamInfo(int teamId, String teamName, String city, String captain, String ambassader, Blob flag) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.city = city;
		this.captain = captain;
		this.ambassader = ambassader;
		this.flag = flag;
	}
	public TeamInfo() {
		
	}
	
	
	

	@Override
	public String toString() {
		return "TeamInfo [teamId=" + teamId + ", teamName=" + teamName + ", city=" + city + ", captain=" + captain
				+ ", ambassader=" + ambassader + ", flag=" + flag + "]";
	}



	public int getTeamId() {
		return teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getCity() {
		return city;
	}

	public String getCaptain() {
		return captain;
	}

	public String getAmbassader() {
		return ambassader;
	}

	public Blob getFlag() {
		return flag;
	}
	
	

}
