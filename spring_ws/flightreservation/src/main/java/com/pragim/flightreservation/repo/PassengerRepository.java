package com.pragim.flightreservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pragim.flightreservation.entity.Passenger;
import com.pragim.flightreservation.entity.Reservation;
import com.pragim.flightreservation.entity.User;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

	

}
