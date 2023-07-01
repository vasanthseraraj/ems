package com.vasanth.ems.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.vasanth.ems.dto.OrderDto;
import com.vasanth.ems.entity.Customer;

public interface CustomerService {

	public List<Customer> addCustomers(List<Customer> customers);

	public List<OrderDto> getOrderDetails();

}
