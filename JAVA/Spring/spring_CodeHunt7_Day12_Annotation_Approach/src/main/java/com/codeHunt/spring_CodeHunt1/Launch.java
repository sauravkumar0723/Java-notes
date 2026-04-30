package com.codeHunt.spring_CodeHunt1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.codeHunt.spring_CodeHunt1.config.MyConfiguration;



public class Launch {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Crud bean =(Crud) ac.getBean("crud");
//		bean.insert(07, "saurav", "Delhi", 1000);
//		bean.update(14, "nitish");
//		bean.delete(24);
//		bean.readAll();
		bean.readAllPojoBased();
//		bean.readSingleBasedData(24);
	}
	
}
