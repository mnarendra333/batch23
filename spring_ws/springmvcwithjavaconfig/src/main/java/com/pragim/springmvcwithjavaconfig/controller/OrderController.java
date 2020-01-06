package com.pragim.springmvcwithjavaconfig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pragim.springmvcwithjavaconfig.dao.OrderDaoImpl;
import com.pragim.springmvcwithjavaconfig.model.Order;

@Controller
@RequestMapping("/order")
public class OrderController {

	
	@Autowired
	private OrderDaoImpl orderDaoImpl;
	
	
	public void setDaoImpl(OrderDaoImpl daoImpl){
		this.orderDaoImpl = daoImpl;
	}
	
	@GetMapping("/list")
	public String getOrderList(ModelMap model){
		List<Order> orders = orderDaoImpl.getOrders();
		model.addAttribute("list", orders);
		return "orderList";
	}
	
	
	
}
