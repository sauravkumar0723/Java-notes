package com.codeHunt.spring_CodeHunt1;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Day8 
// Set Injection
// --> we inject collection either through setter or constructor

// set injection through Setter

public class Employee {
	
	private int eid;
	private String ename;
	private Set<String> setOfBooks;
	
	
	
	
	public Employee() {
		 System.out.println("Employee BEAN INSTANTIATION");
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	
	
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	

	
	public Set<String> getSetOfBooks() {
		return setOfBooks;
	}
	public void setSetOfBooks(Set<String> setOfBooks) {
		this.setOfBooks = setOfBooks;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", setOfBooks=" + setOfBooks + "]";
	}
	
}
