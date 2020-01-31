package com.pragim.checkinapp.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pragim.checkinapp.bean.Reservation;
import com.pragim.checkinapp.bean.ReservationUpdateRequest;

@Component
public class CheckInClient {

	@Autowired
	private RestTemplate restTemplate;

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Reservation getReservationData(int id) {
		return restTemplate.getForObject(
				"http://localhost:6666/flightreservation/resdetails/" + id,
				Reservation.class);
	}

	public Reservation updateReservation(ReservationUpdateRequest request) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject(
				"http://localhost:6666/flightreservation/checkin", request,
				Reservation.class);

	}

}
