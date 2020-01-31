package com.pragim.flightreservation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.flightreservation.bean.ReservationRequest;
import com.pragim.flightreservation.bean.ReservationUpdateRequest;
import com.pragim.flightreservation.entity.Reservation;
import com.pragim.flightreservation.repo.ReservationRepository;

@RestController
public class RestReservatonController {
	
	@Autowired
	private ReservationRepository repo;
	
	@GetMapping(value="/resdetails/{id}")
	public Reservation getResData(@PathVariable("id") String resId){
		return repo.findById(Integer.parseInt(resId)).get();
	}
	
	
	@PostMapping(value="/checkin")
	public Reservation checkin(@RequestBody ReservationUpdateRequest request){
		Reservation reservation = repo.findById(request.getResId()).get();
		reservation.setNumberOfBags(request.getNoOfBags());
		if(request.isCheckedIn())
		reservation.setCheckedIn(1);
		return repo.save(reservation);
	}

}
