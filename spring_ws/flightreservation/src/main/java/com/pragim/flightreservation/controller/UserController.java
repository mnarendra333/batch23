package com.pragim.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pragim.flightreservation.entity.User;
import com.pragim.flightreservation.repo.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userepo;
	
	
	//TODO
	
	@GetMapping(path="/list")
	public void getUserList(){
		List<User> userList = userepo.findAll();
		userList.forEach(obj->System.out.println(obj));
	}
	
	@GetMapping(path="/")
	public String showRegLink(){
		return "showReg";
	}
	
	
	
	
	

}
