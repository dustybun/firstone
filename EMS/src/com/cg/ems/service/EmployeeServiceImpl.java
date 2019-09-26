package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dto.Employee;

@Service("EmpService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao EmpDao;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return EmpDao.save(emp);
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeData(int empId) {
		// TODO Auto-generated method stub
		
	}
}

	
