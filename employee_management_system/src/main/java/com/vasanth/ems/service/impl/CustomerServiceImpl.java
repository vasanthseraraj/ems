package com.vasanth.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasanth.ems.dto.OrderDto;
import com.vasanth.ems.entity.Customer;
import com.vasanth.ems.repository.CustomerRepo;
import com.vasanth.ems.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public List<Customer> addCustomers(List<Customer> customers) {

		return customerRepo.saveAll(customers);
	}

	@Override
	public List<OrderDto> getOrderDetails() {
		// TODO Auto-generated method stub
		return customerRepo.getOrderDetails();
	}




}
