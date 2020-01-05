package com.pragim.springmvccrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value="/displayform",method=RequestMethod.GET)
	public String displayAddProductPage(ModelMap model){
		Product product = new Product();
		model.addAttribute("product", product);
		return "addProduct";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product,ModelMap model){
		String message = dao.saveProduct(product);
		model.addAttribute("msg", message);
		return "redirect:/product/list";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String getProducts(@RequestParam(name="msg",required=false) String message,ModelMap model){
		List<Product> products = dao.getProducts();
		products.forEach(System.out::println);
		model.addAttribute("msg", message);
		model.addAttribute("list",products);
		return "productList";
	}
	
	@RequestMapping("/delete")
	public String deleteProduct(@RequestParam("id") String id,ModelMap model){
		
		int proId = Integer.parseInt(id);
		String message = dao.deleteProduct(proId);
		model.addAttribute("msg", message);
		
		return "redirect:/product/list";
	}
	
	@RequestMapping("/displayedit")
	public String displayEditForm(@RequestParam("id") String pid, ModelMap model){
		int proId = Integer.parseInt(pid);
		Product product = dao.findProductById(proId);
		model.addAttribute("product", product);
		return "editProduct";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product product,ModelMap model){
		String message = dao.updateProduct(product);
		model.addAttribute("msg", message);
		return "redirect:/product/list";
	}

}
