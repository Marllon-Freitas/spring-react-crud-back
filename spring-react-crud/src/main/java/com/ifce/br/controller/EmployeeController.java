package com.ifce.br.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ifce.br.model.Employee;
import com.ifce.br.repository.EmployeeRepository;

@CrossOrigin
@RestController 

public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
    //get all employees	
	@GetMapping("/")
	public List<Employee> getAllEmployee() {
		return employeerepository.findAll();
	}
	
    //create a employee
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeerepository.save(employee); 
	}
	
    //get a single employee
	@GetMapping("/employees/{id}")
	public Employee getSingleEmployee(@PathVariable Long id) {
		return employeerepository.findById(id).get(); 
	}
	
    //update a employee
	@PutMapping("/employees")
	public Employee updateEmployeeDetails(@RequestBody Employee employee) {
		return employeerepository.save(employee); 
	}
	
    //delete a employee
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long id) {
		employeerepository.deleteById(id);
		return  new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
}
