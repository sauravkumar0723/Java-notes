package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee {
	
	public  Employee() {
		System.out.println("Emp bean Instantiation");
	}
	
	
	
	// initialization
	@PostConstruct
	public void ifnit() {
		System.out.println("Emp Bean Initialization");
	}
	
	public void test() {
		System.out.println("Emp Bean custom method........");
	}
	@PreDestroy
	public void annoDestroy() {
		System.out.println("Emp BEAN Destroy");
	}
	
	
	

}
