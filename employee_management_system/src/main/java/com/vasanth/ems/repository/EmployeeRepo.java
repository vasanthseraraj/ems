package com.vasanth.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasanth.ems.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
