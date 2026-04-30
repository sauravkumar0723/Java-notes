package com.codeHunt.spring_CodeHunt1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Day9 
public class Employee {
	
	private int eid;
	private String ename;
	private Properties properties;
	
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
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", properties=" + properties + "]";
	}	
}
