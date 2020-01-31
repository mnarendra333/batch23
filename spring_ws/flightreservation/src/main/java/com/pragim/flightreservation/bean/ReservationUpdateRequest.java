package com.pragim.flightreservation.bean;

public class ReservationUpdateRequest {

	private int resId;

	private boolean checkedIn;

	private int noOfBags;

	public ReservationUpdateRequest(int resId, boolean checkedIn, int noOfBags) {
		super();
		this.resId = resId;
		this.checkedIn = checkedIn;
		this.noOfBags = noOfBags;
	}
	
	

	public ReservationUpdateRequest() {
		super();
	}



	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNoOfBags() {
		return noOfBags;
	}

	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}

}
