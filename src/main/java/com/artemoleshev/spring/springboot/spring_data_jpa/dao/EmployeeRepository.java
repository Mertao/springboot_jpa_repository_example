package com.artemoleshev.spring.springboot.spring_data_jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artemoleshev.spring.springboot.spring_data_jpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	public List<Employee> findAllByName(String name);
}
