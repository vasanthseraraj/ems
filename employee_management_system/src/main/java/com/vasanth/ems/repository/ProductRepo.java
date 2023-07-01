package com.vasanth.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasanth.ems.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
