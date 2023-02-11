package com.springboot.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.ems.entity.Employee;
import com.springboot.ems.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeesManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee("Georgios", "Panagiotopoulos", "georgios@gmail.com");
//		employeeRepository.save(employee1);
//		
//		Employee employee2 = new Employee("Giorgos", "Panas", "pana@gmail.com");
//		employeeRepository.save(employee2);
//		
//		Employee employee3 = new Employee("Giorgis", "Pana", "panagiorgis@gmail.com");
//		employeeRepository.save(employee3);
	}

}
