package com.codeHunt.spring_CodeHunt1;

import java.util.List;

// note :- dependency injectin using collection list
// through settter
// 1. arraylist
//2. linkedlist
public class Employee {
	
	private int eid;
	private String ename;
	private List<String> listOfBooks;
	
	public  Employee() {
		System.out.println("Emp bean Instantiation");
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
