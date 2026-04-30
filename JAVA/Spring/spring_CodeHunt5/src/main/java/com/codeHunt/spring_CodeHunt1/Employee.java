package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee {
	
	private String url;
	private String countryCode;
	private int eid;
	
	public  Employee() {
		System.out.println("Emp bean Instantiation");
	}

	

	public void setUrl(String url) {
		this.url = url;
	}

	

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	

	public void setEid(int eid) {
		this.eid = eid;
	}



	@Override
	public String toString() {
		return "Employee [url=" + url + ", countryCode=" + countryCode + ", eid=" + eid + "]";
	}
	
	
	
	
	
	
	
	
	

}
