package com.mphasis.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mphasis.model.Employee;
import com.mphasis.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/posts")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getOneEmployee(@PathVariable int id ) {
		java.util.Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
		throw new RuntimeException("emp not found");
		
	}
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	@DeleteMapping("/employee/{id}")
	public String deleteOneEmployee(@PathVariable int id ) {
		java.util.Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			 employeeRepository.delete(employee.get());
			 return "emp is deleted";
		}else {
		throw new RuntimeException("emp not found");
		
	}
		
}
}
