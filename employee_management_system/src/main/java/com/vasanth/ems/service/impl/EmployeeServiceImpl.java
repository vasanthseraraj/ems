package com.vasanth.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasanth.ems.entity.Employee;
import com.vasanth.ems.exception.ResourceNotFoundException;
import com.vasanth.ems.repository.EmployeeRepo;
import com.vasanth.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public String addEmployees(List<Employee> employees) {
		employeeRepo.saveAll(employees);
		return "Data Inserted Succesfully";
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployee(Integer id) {
		return employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		Employee existingEmployee = employeeRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));

		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setAge(employee.getAge());
		existingEmployee.setEmail(employee.getEmail());

		return employeeRepo.save(existingEmployee);
	}

	@Override
	public String deleteEmployee(Integer id) {

		employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
		employeeRepo.deleteById(id);

		return "Record Deleted Successfully!";
	}

}
