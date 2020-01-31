package com.pragim.flightreservation.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Reservation {

	@Id
	@SequenceGenerator(name = "Res_Gen", sequenceName = "res_seq",allocationSize=1)
	@GeneratedValue(generator = "Res_Gen")
	private int id;

	@Column(name = "CHECKED_IN")
	private int checkedIn;

	@Column(name = "NUMBER_OF_BAGS")
	private int numberOfBags;

	@Column(name = "CREATED")
	private Timestamp createdDate;

	@OneToOne
	private Flight flight;

	@OneToOne
	private Passenger passenger;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(int checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
