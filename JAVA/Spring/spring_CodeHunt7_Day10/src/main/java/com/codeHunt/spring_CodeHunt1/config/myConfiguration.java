package com.codeHunt.spring_CodeHunt1.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.codeHunt.spring_CodeHunt1.Employee;

@Configuration
@ComponentScan(basePackages = {"com.codeHunt.spring_CodeHunt1"})
public class myConfiguration {
	
//	@Bean(initMethod = "init", destroyMethod ="destroy")
//	public Employee getEmployee() {
//		return new  Employee();
//	}
}
