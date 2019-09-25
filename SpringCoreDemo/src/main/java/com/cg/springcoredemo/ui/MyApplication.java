package com.cg.springcoredemo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcoredemo.dto.Product;
import com.cg.springcoredemo.service.ProductService;

public class MyApplication {
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("Spring.xml");
		ProductService productservice=(ProductService) app.getBean("productservice");
		
		Product pro=(Product) app.getBean("prod");
		pro.setProdId(1001);
		pro.setProdName("Mobile");
		productservice.addProduct(pro);
		System.out.println(productservice.showProduct());
	}

}
