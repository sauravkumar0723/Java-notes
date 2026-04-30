package com.codeHunt.spring_CodeHunt1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee = (Employee) ac.getBean("employee");
		Manager manager = (Manager) ac.getBean("manager");
		Student student = (Student) ac.getBean("student");
		
		System.out.println(employee);
		System.out.println(manager);
		System.out.println(student);
		
		ac.close();
		
	}
	
	
	

}
