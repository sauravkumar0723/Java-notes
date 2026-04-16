package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeCrud;

@SpringBootApplication
public class SpringBoot3PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringBoot3PracticeApplication.class, args); // this line activate spring boot
		EmployeeCrud bean = ac.getBean(EmployeeCrud.class);
		
//		bean.save(new EmployeeEntity(9,"simran", "bandhuganj",1100));
//		bean.save(new EmployeeEntity(04,"nitish", "ganj",1101));
//		bean.save(new EmployeeEntity(14,"dimpal", "koderma",11000));
//		
//		List<EmployeeEntity> list = bean.findAll();
//		for(EmployeeEntity emp : list) {
//			System.out.println(emp);
//		}
		

		
		
//		Optional<EmployeeEntity> byId = bean.findById(9);
//		EmployeeEntity employeeEntity  = byId.get();
//		System.out.println(employeeEntity);
		
		//bean.deleteAll();
		//bean.deleteById(13);
		
		// customized appraoch this approach is highly complex uses
//		bean.saveMyData(18,"mahi","lucknow",1400900);
		
		// select query
//		List<EmployeeEntity> myData =  bean.readMyData();
//		System.out.println(myData);
		
		// hql
//		List<EmployeeEntity> myData =  bean.readMyAllData();
//		System.out.println(myData);
		
		
		// jpa repository
//		List<EmployeeEntity> list1 = bean.findAll();
//		for(EmployeeEntity emp : list1) {
//			System.out.println(emp);
//		}
//		List<EmployeeEntity> list2 = bean.findAll(Sort.by("esalary"));
//		for(EmployeeEntity emp : list2) {
//			System.out.println(emp);
//		}
		
		// derived Repository
		List<EmployeeEntity> bySalary = bean.findByEsalary(1100);
		System.out.println(bySalary);
		
		System.out.println("TEST.......");
	}

}
