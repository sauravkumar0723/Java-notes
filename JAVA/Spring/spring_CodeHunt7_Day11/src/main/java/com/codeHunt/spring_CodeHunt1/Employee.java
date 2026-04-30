package com.codeHunt.spring_CodeHunt1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	@Qualifier("list1")
	private Account account;
	
	@Autowired
	private List<String> listOfBooks;
	public Employee() {
		System.out.println("Employee bean Instantiation: zero parameterized constructor");
	}
	
	public Employee(Account account, List<String> listOfBooks) {
		super();
		this.account = account;
		this.listOfBooks = listOfBooks;
	}

	public Account getAccount() {
		return account;
	}

	public List<String> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	public void setAccount(Account account) {
		System.out.println("Employee Setter Called : Account");
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [account=" + account + ", listOfBooks=" + listOfBooks + "]";
	}
}
