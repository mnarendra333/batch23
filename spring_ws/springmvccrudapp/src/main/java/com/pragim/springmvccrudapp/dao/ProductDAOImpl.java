package com.pragim.springmvccrudapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pragim.springmvccrudapp.util.ProductMapper;
import com.pragim.springmvccrudapp.model.Product;

@Repository
public class ProductDAOImpl {
	
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	public List<Product> getProducts(){
		return jdbcTemplate.query("select * from product", new ProductMapper());

	}



	public String deleteProduct(int id) {
		String message = null;
		int count = jdbcTemplate.update("delete from product where pro_id=?", id);
		if(count>0){
			message = "Product deleted successfully";
		}
		return message;
	}



	public String saveProduct(Product product) {
		String message = null;
		int count = jdbcTemplate.update("insert into product values(prod_seq.nextval,?,?,?)",product.getProName(),product.getPrice(),product.getProDesc());
		if(count>0){
			message = "Product added successfully";
		}
		return message;
		
	}



	public Product findProductById(int proId) {
			
		Product product = jdbcTemplate.queryForObject("select * from product where pro_id=?",new ProductMapper(),proId);
		System.out.println(product);
		return product;
	}



	public String updateProduct(Product product) {
		String message = null;
		int count = jdbcTemplate.update("update product set pro_name=?,price=?,pro_desc=? where pro_id=?",product.getProName(),product.getPrice(),product.getProDesc(),product.getProId());
		if(count>0){
			message = "Product updated successfully";
		}
		return message;
	}
	
	

}
