package com.pragim.flightreservation.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.flightreservation.bean.ReservationRequest;
import com.pragim.flightreservation.entity.Flight;
import com.pragim.flightreservation.entity.Passenger;
import com.pragim.flightreservation.entity.Reservation;
import com.pragim.flightreservation.repo.FlightRepository;
import com.pragim.flightreservation.repo.PassengerRepository;
import com.pragim.flightreservation.repo.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {


	@Autowired
	private PassengerRepository passengerRepo;
	@Autowired
	private ReservationRepository reservationRepo;
	@Autowired
	private FlightRepository flightRepo;
			
			
			
	@Override
	public String bookTicket(ReservationRequest resReq) {
		// TODO Auto-generated method stub
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(resReq.getFirstName());
		passenger.setLastName(resReq.getLastName());
		passenger.setMiddleName(resReq.getMiddleName());
		passenger.setEmail(resReq.getEmail());
		passenger.setMobileNo(resReq.getMobileNo());
		
		passengerRepo.save(passenger);
		Flight flight = flightRepo.findById(Integer.parseInt(resReq.getFid())).get();
		
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCreatedDate(new java.sql.Timestamp(new Date().getTime()));
		
		reservationRepo.save(reservation);
		
		
		return "Flight booking completed successfully..and your Reservation id is "+reservation.getId();
	}

}
