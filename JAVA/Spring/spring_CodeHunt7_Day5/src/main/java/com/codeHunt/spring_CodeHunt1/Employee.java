package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Day4

public class Employee {
	
//	// initialization
//	public void xmlInit() {
//		System.out.println("Resource allocation");
//	}
	
	// Annotation initialization
	@PostConstruct
		public void annoInit() {
			System.out.println("Resource allocation");
		}
	

	public Employee() {
		System.out.println("Employee bean is Instantiation");
	}
	public void test() {
		System.out.println("EMPLOYEE is Tested.....");
	}
	
//	// Destroy
//	public void xmlDestroy() {
//		System.out.println("Resource De-allocation");
//	}
	
	// Annotaitions Destroy
	@PreDestroy
		public void annoDestroy() {
			System.out.println("Resource De-allocation");
		}
	
}
