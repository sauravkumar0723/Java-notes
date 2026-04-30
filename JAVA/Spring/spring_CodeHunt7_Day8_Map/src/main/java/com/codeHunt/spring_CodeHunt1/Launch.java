package com.codeHunt.spring_CodeHunt1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	    Employee employee=(Employee) ac.getBean("employee");
		System.out.println(employee.getMapOfBooks().getClass());
		System.out.println(employee);
		ac.close();
	}
}
