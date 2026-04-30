package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	
	private String id; // Dependency
	
	private Account account; // Spring create and inject
	
	

	public void setAccount(Account account) {
		this.account = account;
	}


	public Employee(String id) {
		super();
		System.out.println("Employee bean Instantiated through constructor paramaeter");
		this.id = id;
	}
	

	public void setId(String id) {
		this.id = id;
	}



	public Employee() {
		System.out.println("Employee bean Instantiated");
	}
	public void test() {
		System.out.println("Emp tested........." + id);
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", account=" + account + "]";
	}
	
	
}
