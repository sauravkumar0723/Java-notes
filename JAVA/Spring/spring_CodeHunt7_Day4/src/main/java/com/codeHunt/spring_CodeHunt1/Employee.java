package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

// Day4

public class Employee {
	private String id;
	private Account account;
	
	
	
	
	public void setAccount(Account account) {
		this.account = account;
	}
	public Employee(String id) {
		System.out.println("Employee bean is Instantiation using through parameter constructpr");
		this.id = id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Employee() {
		System.out.println("Employee bean is Instantiation");
	}
	public void test() {
		System.out.println("EMPLOYEE is Tested....." + id);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", account=" + account + "]";
	}
	
	
}
