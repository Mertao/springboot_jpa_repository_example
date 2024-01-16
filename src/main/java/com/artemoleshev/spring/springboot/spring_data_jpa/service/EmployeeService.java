package com.artemoleshev.spring.springboot.spring_data_jpa.service;

import java.util.List;

import com.artemoleshev.spring.springboot.spring_data_jpa.entity.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	public List<Employee> findAllByName(String name);
}
