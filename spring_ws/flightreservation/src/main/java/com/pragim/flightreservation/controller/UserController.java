package com.pragim.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pragim.flightreservation.bean.LoginBean;
import com.pragim.flightreservation.bean.ShowFlightsBean;
import com.pragim.flightreservation.bean.UserBean;
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
	
	@GetMapping(path="/displayreg")
	public String displayRegForm(ModelMap model){
		UserBean obj = new UserBean();
		model.addAttribute("userbean", obj);
		return "regForm";
	}
	
	@PostMapping(path="/register")
	public String registerUser(@ModelAttribute(name="userbean") UserBean userbean, ModelMap model){
		
		User userEntiry = new User();
		userEntiry.setFirstName(userbean.getFirstName());
		userEntiry.setLastName(userbean.getLastName());
		userEntiry.setEmail(userbean.getEmail());
		userEntiry.setPassword(userbean.getPassword());
		userepo.save(userEntiry);
		model.addAttribute("msg", "user saved!!");
		model.addAttribute("loginbean", new LoginBean());
		return "login";
	}
	
	@PostMapping(path="/login")
	public String login(@ModelAttribute(name="loginbean") LoginBean loginbean, ModelMap model){
		User user = userepo.findByEmailAndPassword(loginbean.getEmail(), loginbean.getPassword());
		String page = null;
		if(user!=null)
			page =  "showFlights";
		model.addAttribute("showFlightsBean", new ShowFlightsBean());
		return page;
	}
	
	
	
	
	

}
