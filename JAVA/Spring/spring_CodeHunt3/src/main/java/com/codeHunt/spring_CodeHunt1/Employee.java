package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;

public class Employee {
	
	public  Employee() {
		System.out.println("Emp bean Instantiation");
	}
	
	// READY: init();
	
	// initialization

	public void xmlInit() {
		System.out.println("Resource Allocation");
	}
	
	public void test() {
		System.out.println("Emp tested........");
	}
	
	
	// destroy
	public void xmlDestroy() {
		System.out.println("resource destroy");
	}

}
