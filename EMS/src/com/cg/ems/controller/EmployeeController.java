package com.cg.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;


public class EmployeeController {
	
	@Autowired
	EmployeeService empservice;
	
	@RequestMapping(value = "/EmployeeDetails", method=RequestMethod.GET)
	public String homepage() {
		return "home";
		
	}

	@RequestMapping(value = "/addpage", method = RequestMethod.GET)
//	}
	public String addEmployee(@ModelAttribute("myemp") Employee emp) {
		return "AddEmployee";
	}
		
	@RequestMapping(value="/pagesubmit", method=RequestMethod.POST)
		public String addData(@ModelAttribute("myemp") Employee emp) {
		empservice.addEmployee(emp);
			return "home";
}}
