package com.cg.springcore.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.service.Employee;

public class MyApplication {
	
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("Spring.xml");
		
		Employee data=(Employee)app.getBean("emp");
		data.getData();
		
				
	}

}
