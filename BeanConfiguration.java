package com.rab3.spring.boot.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public Employee employee() {
		return new Employee();
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}

}