package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;


@Service
public class MyService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeEntity save(EmployeeDto employeeDto) {
		return employeeRepository.save(new EmployeeEntity(employeeDto.getId(),employeeDto.getName()
		 	,employeeDto.getPassword(),employeeDto.getAddress(),employeeDto.getSalary()));
	}
}
