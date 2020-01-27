package com.pragim.flightreservation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Flight {
	@Id
	private int id;
	
	@Column(name="FLIGHT_NUMBER",length=20)
	private String flightNumber;

	@Column(name="OPERATING_AIRLINES",length=30)
	private String operatingAirlines;

	@Column(name="DEPARTURE_CITY",length=20)
	private String departureCity;

	@Column(name="ARRIVAL_CITY",length=20)
	private String arrivalCity;

	@Column(name="DATE_OF_DEPARTURE")
	private Date dateOfDeparture;

	@Column(name="ESTIMATED_DEPARTURE_TIME")
	private Date estimatedDepartureTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Date getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Date estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

}
