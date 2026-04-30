package com.codeHunt.spring_CodeHunt1;

import org.springframework.stereotype.Component;

@Component("test")
public class Test {
	public String doTest() {
		return "test";
	}
	
	public int checkSalary() {
		return 1000;
	}
}
