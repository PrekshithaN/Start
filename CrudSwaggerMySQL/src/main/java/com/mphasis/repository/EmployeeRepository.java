package com.mphasis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
