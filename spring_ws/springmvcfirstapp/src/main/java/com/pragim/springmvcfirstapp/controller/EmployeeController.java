package com.pragim.springmvcfirstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@RequestMapping("/welcome")
	public ModelAndView fgfgdgv(){
	
		ModelAndView obj = new ModelAndView("success", "msg", "Welcome to Spring MVC Framework!!!");
		return obj;
	}

}
