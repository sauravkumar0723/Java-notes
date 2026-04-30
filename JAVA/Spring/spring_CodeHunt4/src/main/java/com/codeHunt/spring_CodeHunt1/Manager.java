package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Manager {
	
	public  Manager() {
		System.out.println("Manager bean Instantiation");
	}
	
	
	
	// initialization

	@PostConstruct
	public void init() {
		System.out.println("Manager Bean Initialization");
	}
	
	public void test() {
		System.out.println("Manager Bean custom method........");
	}
	@PreDestroy
	public void annoDestroy() {
		System.out.println("Manager BEAN Destroy");
	}

}
