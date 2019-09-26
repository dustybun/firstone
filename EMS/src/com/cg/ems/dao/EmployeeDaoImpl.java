package com.cg.ems.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.ems.dto.Employee;
@Repository("EmpDao")
public class EmployeeDaoImpl implements EmployeeDao{
List<Employee> myList=new ArrayList<Employee>();
	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		myList.add(emp);
		return  emp;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return myList;
	}

	@Override
	public Employee findByEmpId(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int empId) {
		// TODO Auto-generated method stub
		
	
		
	}

	
}
