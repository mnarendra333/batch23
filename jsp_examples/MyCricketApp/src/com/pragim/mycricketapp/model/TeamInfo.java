package com.pragim.mycricketapp.model;

public class TeamInfo {

	private int teamId;
	private String teamName;
	private String city;
	private String captain;
	private String ambassadar;

	public TeamInfo(int teamId, String teamName, String city, String captain, String ambassadar) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.city = city;
		this.captain = captain;
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
