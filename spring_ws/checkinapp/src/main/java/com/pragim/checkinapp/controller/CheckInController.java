package com.pragim.checkinapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pragim.checkinapp.bean.Reservation;
import com.pragim.checkinapp.bean.ReservationUpdateRequest;
import com.pragim.checkinapp.client.CheckInClient;

@Controller
public class CheckInController {
	
	
	@Autowired
	private CheckInClient client;
	
	@GetMapping("/")
	public String showRegPage(){
		return "showReg";
	}
	
	@GetMapping("/getres")
	public String showRegPage(@RequestParam("resid") String id, ModelMap model){
		
		int rid = Integer.parseInt(id);
		Reservation reservationData = client.getReservationData(rid);
		model.addAttribute("resData", reservationData);
		return "displayReservation";
	}
	
	@GetMapping(value="/checkin")
	public String checkin(@RequestParam("noOfBags") String bags, @RequestParam("id") String resid,ModelMap model){
		
		ReservationUpdateRequest obj = new ReservationUpdateRequest();
		obj.setResId(Integer.parseInt(resid));
		obj.setNoOfBags(Integer.parseInt(bags));
		obj.setCheckedIn(true);
		
		Reservation reservationData = client.updateReservation(obj);
		model.addAttribute("msg", "checkin completed!!!!");
		return "success";
	}


}
