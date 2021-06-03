package com.neosoft.poc3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.poc3.model.Employee;
import com.neosoft.poc3.repo.EmployeeRepo;

@Service
@Transactional(rollbackOn = Exception.class)
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;

	public Employee saveData(Employee e) {
		e.setFlag(0);

		return repo.save(e);
	}

	public String softDelete(int id) {

		Employee emp = repo.findById(id).get();

		emp.setFlag(1);

		repo.save(emp);

		return "employee delete sucessfully";

	}

	public List<Employee> getAll() {

		List<Employee> list = repo.findAll();

		List<Employee> list2 = new ArrayList<>();

		for (Employee employee : list) {

			if (employee.getFlag() == 0)

				list2.add(employee);

		}

		return list2;
	}

}
