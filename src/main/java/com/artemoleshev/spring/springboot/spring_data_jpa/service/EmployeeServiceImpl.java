package com.artemoleshev.spring.springboot.spring_data_jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artemoleshev.spring.springboot.spring_data_jpa.dao.EmployeeRepository;
import com.artemoleshev.spring.springboot.spring_data_jpa.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public List<Employee> findAllByName(String name) {
		return employeeRepository.findAllByName(name);
	}
	
	@Override
	public Employee getEmployee(int id) {
		Employee employee = null;
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		
		if (optionalEmployee.isPresent()) {
			employee = optionalEmployee.get();
		}
		
		return employee;
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
}
