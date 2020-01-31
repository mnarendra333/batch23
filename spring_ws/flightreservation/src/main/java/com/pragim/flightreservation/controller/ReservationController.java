package com.pragim.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pragim.flightreservation.bean.ReservationRequest;
import com.pragim.flightreservation.service.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService resService;
	
	
	@PostMapping("/bookTicket")
	public String bookTicket(@ModelAttribute("reservationRequest") ReservationRequest resReq, ModelMap model){
		String message = resService.bookTicket(resReq);
		model.addAttribute("msg", message);
		return "viewTicket";
	}

}
