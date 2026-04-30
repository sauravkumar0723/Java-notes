package com.codeHunt.spring_CodeHunt1.config;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



@Configuration
@ComponentScan(basePackages = {"com.codeHunt.spring_CodeHunt1"})
public class myConfiguration {
	
	@Bean("list1")
	public List<String> getList1() {
		return Arrays.asList("b1","b2","b3");
	}
	
	@Bean("list2")
	@Primary
	public List<String> getList2() {
		return Arrays.asList("b11","b22","b33");
	}
	
	@Bean("list3")
	public List<String> getList3() {
		return Arrays.asList("b111","b222","b333");
	}
}
