package com.codeHunt.spring_CodeHunt1;


import org.springframework.context.support.ClassPathXmlApplicationContext;





public class Launch {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		Crud bean =(Crud) ac.getBean("crud");
		bean.insert(26, "Ankit", "Delhi", 1000);
//		bean.update(14, "nitish");
//		bean.delete(16);
//		bean.readAll();
//		bean.readAllPojoBased();
//		bean.readSingleBasedData(7);
	}
	
}
