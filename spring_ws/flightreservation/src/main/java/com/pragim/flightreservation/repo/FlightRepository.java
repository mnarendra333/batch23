package com.pragim.flightreservation.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pragim.flightreservation.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query("select f from Flight f where f.departureCity=:departureCity and f.arrivalCity=:arrivalCity and f.dateOfDeparture=:dateOfDeparture")
	List<Flight> findByDepartureCity(@Param("departureCity") String departureCity, @Param("arrivalCity") String arrivalCity, @Param("dateOfDeparture") Date dateOfDeparture );

	

}
