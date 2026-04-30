package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student {
	
	private String url;
	private String countryCode;
	private int roll;
	
	public  Student() {
		System.out.println("Student bean Instantiation");
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setSid(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [url=" + url + ", countryCode=" + countryCode + ", roll=" + roll + "]";
	}
	
	
	

}
