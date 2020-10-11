package com.rab3.spring.boot.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);
		Employee employee = annotationConfigApplicationContext.getBean("employee", Employee.class);
		employee.printEmployee("Welcome to VA");
		EmployeeService employeeService = annotationConfigApplicationContext.getBean("employeeService",
				EmployeeService.class);
		employeeService.printEmployeeService();

	}

}
