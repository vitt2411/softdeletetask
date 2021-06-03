package com.neosoft.poc3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poc3.model.Employee;
import com.neosoft.poc3.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/add")
	public Employee add(@RequestBody Employee e) {

		return service.saveData(e);

	}

	@DeleteMapping("/delete/{id}")
	public String softDelete(@PathVariable("id") int id) {
		System.out.println("another statement added");
		return service.softDelete(id);

	}

	@GetMapping("/all")
	public List<Employee> getAll() {

		return service.getAll();

	}

}
