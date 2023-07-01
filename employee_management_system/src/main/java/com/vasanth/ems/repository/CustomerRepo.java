package com.vasanth.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vasanth.ems.dto.OrderDto;
import com.vasanth.ems.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	@Query(value = "select c.customer_name,p.product_name,p.quantity from customer_mst c inner join product_mst p where customer_id = cusprod_id", nativeQuery = true)
	public List<OrderDto> getOrderDetails();

}
