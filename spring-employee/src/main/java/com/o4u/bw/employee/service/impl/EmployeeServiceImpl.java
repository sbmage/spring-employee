package com.o4u.bw.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o4u.bw.employee.dao.EmployeeDAO;
import com.o4u.bw.employee.model.Employee;
import com.o4u.bw.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public List<Employee> getEmployeeList() {
		return employeeDAO.selectList();
	}

	@Override
	public Employee getEmployee(Employee employee) {
		return employeeDAO.select(employee);
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDAO.insert(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDAO.update(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeDAO.delete(employee);
	}

}
