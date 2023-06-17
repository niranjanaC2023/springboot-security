package com.eidiko.niranjana.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.dao.IEmployeeDao;
import com.eidiko.niranjana.dto.Employee;
@Service
public class EmployeeDAOImpl implements IEmployeeDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> fetchAllEmployeeData() 
	{
		String fetchData = "select id,name,age from employee";
		List<Employee> list = jdbcTemplate.query(fetchData, BeanPropertyRowMapper.newInstance(Employee.class));
		return list;
	}

}
