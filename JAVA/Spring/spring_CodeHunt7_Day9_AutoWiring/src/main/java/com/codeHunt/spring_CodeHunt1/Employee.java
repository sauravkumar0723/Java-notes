package com.codeHunt.spring_CodeHunt1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Day9 
// Autowiring through xml
public class Employee {
	
	private int eid;
	private Account account;
	private Car car;
	private List<String> listofBooks;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Account account, Car car, List<String> listofBooks) {
		super();
		this.account = account;
		this.car = car;
		this.listofBooks = listofBooks;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<String> getListofBooks() {
		return listofBooks;
	}

	public void setListofBooks(List<String> listofBooks) {
		this.listofBooks = listofBooks;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", account=" + account + ", car=" + car + ", listofBooks=" + listofBooks + "]";
	}
	
	
		
}
