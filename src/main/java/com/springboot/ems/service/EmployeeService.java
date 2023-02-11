package com.springboot.ems.service;

import java.util.List;
import com.springboot.ems.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	Employee updateEmployee(Employee employee);
	void deleteEmployeeById(Long Id);
}
