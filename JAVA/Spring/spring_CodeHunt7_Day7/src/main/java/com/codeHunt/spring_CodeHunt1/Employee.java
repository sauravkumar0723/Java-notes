package com.codeHunt.spring_CodeHunt1;

import java.util.List;
import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Day7 
// Collection Injection
// --> we inject collection either through setter or constructor

// Collection injection through Setter

public class Employee {
	
	private int eid;
	private String ename;
	private List<String> listOfBooks;
	
	
	
	
	public Employee() {
		 System.out.println("Employee BEAN INSTANTIATION");
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	
	
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public List<String> getListOfBooks() {
		return listOfBooks;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", listOfBooks=" + listOfBooks + "]";
	}
	
}
