package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student {
	
	public  Student() {
		System.out.println("Student bean Instantiation");
	}
	
@PostConstruct
	public void unit() {
		System.out.println("Student bean initialization");
	}
	
	public void test() {
		System.out.println("Student bean custom method........");
	}
	
	
	// destroy
	@PreDestroy
	public void annoDestroy() {
		System.out.println("Student bean destroy");
	}

}
