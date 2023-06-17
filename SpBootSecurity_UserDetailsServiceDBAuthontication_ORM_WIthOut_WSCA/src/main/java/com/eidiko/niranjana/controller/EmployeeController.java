package com.eidiko.niranjana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.dto.Employee;
import com.eidiko.niranjana.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService service;

	@GetMapping("/fetchEmployeeAllData")
	public List<Employee> fetchAllEmployeeDataFromDB() {
		List<Employee> list = service.fetchAllEmployeeData();
		return list;
	}

}
