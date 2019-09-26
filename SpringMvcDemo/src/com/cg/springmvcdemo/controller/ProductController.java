package com.cg.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	// to handle the mapping we will add annotation
	@Autowired
	ProductService prodservice;

	@RequestMapping(value = "/myfirst", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}

	@RequestMapping(value = "/addpage", method = RequestMethod.GET)
//	public String addProduct(Model model) {
//		model.addAttribute("login", new Product());
//		return "AddProduct";
//	}
	public String addProduct(@ModelAttribute("mypro") Product pro) {
		return "AddProduct";
	}
		
	@RequestMapping(value="/pagesubmit", method=RequestMethod.POST)
		public String addData(@ModelAttribute("mypro") Product pro) {
		prodservice.addProduct(pro);
			return "home";
			
	}
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList=prodservice.showProduct();
		return new ModelAndView("ShowProduct","smaan", myList) ;
	
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deletePage() {
		return "DeleteProduct";
		
	}
	@RequestMapping(value="/deletedata", method=RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int prodId) {
		System.out.println(prodId);
		prodservice.removeData(prodId);
		return "redirect:/showall";
	}
}

