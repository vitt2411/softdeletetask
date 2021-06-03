package com.neosoft.poc3;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.neosoft.poc3.model.Employee;
import com.neosoft.poc3.repo.EmployeeRepo;
import com.neosoft.poc3.service.EmployeeService;

@SpringBootApplication
public class EmployeeManageMnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManageMnetApplication.class, args);

	}

}
