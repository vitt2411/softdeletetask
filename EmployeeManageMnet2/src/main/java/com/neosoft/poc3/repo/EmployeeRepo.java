package com.neosoft.poc3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.poc3.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
