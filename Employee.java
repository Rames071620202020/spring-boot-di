package com.rab3.spring.boot.di;

public class Employee {
	private Integer id;
	private String firstName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void printEmployee(String msg) {
		System.out.println(msg);
	}

}
