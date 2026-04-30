package com.codeHunt.spring_CodeHunt1;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Day10
// Annotaition approach

//@Component("emp")
@Component
@Lazy
//@Scope("prototype")
@Scope
public class Employee {
	
	public Employee() {
		 System.out.println("BEAN INSTANTIATION");
	}
	@PostConstruct
	public void init() {
		System.out.println("bean init");
	}
	@PreDestroy
    public void destroy() {
		System.out.println("bean destroy");
	}
	
	public void test() {
		System.out.println("Bean TESTED");
	}
}
