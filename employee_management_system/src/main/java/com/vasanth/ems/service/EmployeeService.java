package com.vasanth.ems.service;

import java.util.List;

import com.vasanth.ems.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public String addEmployees(List<Employee> employees);

	public List<Employee> getAll();

	public Employee getEmployee(Integer id);

	public Employee updateEmployee(Employee employee, Integer id);

	public String deleteEmployee(Integer id);
	
	

}
