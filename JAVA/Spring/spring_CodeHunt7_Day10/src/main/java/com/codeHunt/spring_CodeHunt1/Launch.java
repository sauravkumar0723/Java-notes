package com.codeHunt.spring_CodeHunt1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeHunt.spring_CodeHunt1.config.myConfiguration;

public class Launch {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myConfiguration.class);
//		Employee bean = (Employee) ac.getBean("emp");
		Employee bean1 =  ac.getBean(Employee.class);
		System.out.println(bean1);
		bean1.test();
		
		Employee bean2 =  ac.getBean(Employee.class);
		System.out.println(bean2);
		bean2.test();
		
		ac.close();
	}
}
