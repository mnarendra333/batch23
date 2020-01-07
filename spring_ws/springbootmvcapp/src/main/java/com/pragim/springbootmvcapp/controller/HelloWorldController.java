package com.pragim.springbootmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/test")
	public ModelAndView greetings(ModelMap model) {
		return new ModelAndView("success", "msg",
				"welcome to spring boot mvc app");
	}

}
