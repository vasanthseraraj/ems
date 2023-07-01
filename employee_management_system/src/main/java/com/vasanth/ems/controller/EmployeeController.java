package com.vasanth.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasanth.ems.entity.Employee;
import com.vasanth.ems.service.EmployeeService;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.CREATED);

	}
	@PostMapping("/addEmployees")
	public ResponseEntity<String> addEmployees(@RequestBody List<Employee> employees) {
		
		return  ResponseEntity.ok(employeeService.addEmployees(employees));

	}

	@GetMapping("/all")
	public List<Employee> getAll() {
		return employeeService.getAll();

	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id) {
		return new ResponseEntity<Employee>(employeeService.getEmployee(id), HttpStatus.OK);

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> getEmployee(@RequestBody Employee employee ,@PathVariable("id") Integer id) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id), HttpStatus.OK);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id) {
		return new ResponseEntity<String>(employeeService.deleteEmployee(id), HttpStatus.OK);

	}
	

}
