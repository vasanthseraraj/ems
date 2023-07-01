package com.vasanth.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasanth.ems.dto.OrderDto;
import com.vasanth.ems.entity.Customer;
import com.vasanth.ems.service.CustomerService;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/addCustomers")
	public List<Customer> addCustomer(@RequestBody List<Customer> customers) {

		return customerService.addCustomers(customers);

	}
	
	@GetMapping("/getOrderDetails")
	public List<OrderDto> getOrderDetails() {
	    return customerService.getOrderDetails();
	}


}
