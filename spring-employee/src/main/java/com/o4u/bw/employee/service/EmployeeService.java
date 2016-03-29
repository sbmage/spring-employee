package com.o4u.bw.employee.service;

import java.util.List;

import com.o4u.bw.employee.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployeeList();

	public Employee getEmployee(Employee employee);

	public void insertEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

}
