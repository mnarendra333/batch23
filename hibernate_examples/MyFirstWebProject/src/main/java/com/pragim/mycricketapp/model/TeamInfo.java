package com.pragim.mycricketapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myipl_teams_data")
public class TeamInfo {

	@Id
	@GeneratedValue
	@Column(name="TEAM_ID")
	private int teamId;
	
	@Column(name="TEAM_NAME",length=20)
	private String teamName;
	
	@Column(name="CITY",length=20)
	private String city;
	
	@Column(name="CAPTAIN",length=20)
	private String captain;
	
	@Column(name="AMBASSADER",length=20)
	private String ambassadar;

	public TeamInfo(int teamId, String teamName, String city, String captain, String ambassadar) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.city = city;
		this.captain = captain;
		this.ambassadar = ambassadar;
	}
	
	
	
	

	public TeamInfo() {
		super();
	}





	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public void setCaptain(String captain) {
		this.captain = captain;
	}



	public void setAmbassadar(String ambassadar) {
		this.ambassadar = ambassadar;
	}



	@Override
	public String toString() {
		return "TeamInfo [teamId=" + teamId + ", teamName=" + teamName + ", city=" + city + ", captain=" + captain
				+ ", ambassadar=" + ambassadar + "]";
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

	public String getAmbassadar() {
		return ambassadar;
	}
	
	

}
