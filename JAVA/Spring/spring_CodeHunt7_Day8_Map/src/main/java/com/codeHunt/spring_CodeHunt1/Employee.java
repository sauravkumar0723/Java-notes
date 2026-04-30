package com.codeHunt.spring_CodeHunt1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Day8 
// Map Injection
// --> we inject collection either through setter or constructor

// map injection through Setter

public class Employee {
	
	private int eid;
	private String ename;
	private Map<String,String> mapOfBooks;
	
	
	
	
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
	
	
	
	
	
	public Map<String, String> getMapOfBooks() {
		return mapOfBooks;
	}
	public void setMapOfBooks(Map<String, String> mapOfBooks) {
		this.mapOfBooks = mapOfBooks;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mapOfBooks=" + mapOfBooks + "]";
	}
	
}
