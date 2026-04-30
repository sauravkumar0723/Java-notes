package com.codeHunt.spring_CodeHunt1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeHunt.spring_CodeHunt1.config.MyConfiguration;

public class Launch {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee bean = ac.getBean(Employee.class);
		System.out.println(bean);
	}
}
