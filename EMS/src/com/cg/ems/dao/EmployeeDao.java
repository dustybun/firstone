package com.cg.ems.dao;

import java.util.List;

import com.cg.ems.dto.Employee;

public interface EmployeeDao {
	
	public Employee save(Employee emp);
	public List<Employee>findAll();
	public Employee findByEmpId(int empId);
	public void remove(int empId);

}
