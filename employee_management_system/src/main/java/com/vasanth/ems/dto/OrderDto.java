package com.vasanth.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
   
	private String customerName;
	private String productName;
	private Integer quantity;
	
	
}
