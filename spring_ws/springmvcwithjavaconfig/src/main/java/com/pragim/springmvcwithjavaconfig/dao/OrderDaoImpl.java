package com.pragim.springmvcwithjavaconfig.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pragim.springmvcwithjavaconfig.model.Order;
import com.pragim.springmvcwithjavaconfig.util.OrderMapper;

@Repository
public class OrderDaoImpl {
	
	
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public OrderDaoImpl(DataSource dataSource){
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	public List<Order> getOrders(){
		return jdbcTemplate.query("select * from orders", new OrderMapper());
	}

}
