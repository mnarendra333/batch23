package com.pragim.springmvccrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.springmvccrudapp.dao.ProductDAOImpl;
import com.pragim.springmvccrudapp.model.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	
	private ProductDAOImpl dao;
	
	@Autowired
	public void setDao(ProductDAOImpl dao) {
		this.dao = dao;
	}



	@RequestMapping("/list")
	public ModelAndView getProducts(){
		List<Product> products = dao.getProducts();
		products.forEach(System.out::println);
		return new ModelAndView("productList", "list", products);
	}

}
