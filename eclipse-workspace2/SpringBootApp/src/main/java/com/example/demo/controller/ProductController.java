package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller

public class ProductController {
	@Autowired
	ProductService service;
	@GetMapping("/display")
	public String displayProduct(Model model) {
		//Product myprd= new Product(1,"java",350);
		Product prd = service.getProductById(2);
		model.addAttribute("product",prd);
		return "displayProduct";
	}
	/*
	@GetMapping("/displaylist")
	public String displayProductList(Model model) {
		List<Product> list= new ArrayList<>();
		list.add(new Product(2,"Python",600));
		list.add(new Product(3,"MachineLearing", 1000));
		list.add(new Product(3,"DataScience", 500));
		model.addAttribute("displayList", list);
		return "displayProductList";
		
	}*/
	@GetMapping("displaylist")
	public String displayProductList(Model model) {
		Iterable<Product> myprd =service.getAllProducts();
		model.addAttribute("displayList", myprd);
		return "displayProductList";
	}
	@GetMapping("/user")
	public ModelAndView printUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user","swati");
		mv.setViewName("user");
		return mv;
	}
	@GetMapping("/addProduct")
	public ModelAndView addProduct() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("product",new Product());
		mv.setViewName("addProduct");
		return mv;
	}
	@PostMapping("/addProduct")
	@ResponseBody
	public String addNewProduct(Product prd) {
		return service.saveProduct(prd);
	}

}
