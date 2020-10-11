package com.rab3.spring.boot.di;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService{
//	public EmployeeService(@Autowired Employee employee) {
//		this.employee=employee;
//	}
	@Autowired
	private Employee employee;
//	public void printEmployeeService() {
//		employee.printEmployee("Hi Good Afternoon");
//	}
	public void setEmployee(@Autowired Employee employee) {
		this.employee=employee;
	}
	public void printEmployeeService() {
		System.out.println("fsfdlsehenlsdlf");
	}
}
