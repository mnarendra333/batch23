package com.pragim.flightreservation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;










import com.pragim.flightreservation.bean.ShowFlightsBean;
import com.pragim.flightreservation.entity.Flight;
import com.pragim.flightreservation.repo.FlightRepository;

@Controller
@RequestMapping(value="/flight")
public class FlightController {
	
	@Autowired
	private FlightRepository flightrepo;
	
	
	@PostMapping("/searchFlights")
	public String searchFlights(@ModelAttribute(name="showFlightsBean") ShowFlightsBean searchBean,ModelMap model) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		Date ddep = sdf.parse(searchBean.getDate());
		
		List<Flight> flightList = flightrepo.findByDepartureCity(searchBean.getFrom(),searchBean.getTo(),ddep);
		model.addAttribute("flights", flightList);
		return "displayFlights";
	}
	
	
	

}
