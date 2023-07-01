package com.vasanth.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "product_mst")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_id;
	private String productName;
	private Integer quantity;

}
