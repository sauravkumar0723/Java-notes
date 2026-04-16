package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.EmployeeEntity;

public interface EmployeeCrud extends JpaRepository<EmployeeEntity, Integer> {

	// this approach is highly complex uses
	@Modifying
	@Transactional
	@Query(value = "insert into employee(eid, ename, eaddress, esalary) values(:eid,:ename,:eaddress,:esalary)" , nativeQuery = true)
	public int saveMyData(@Param("eid") int eid, @Param("ename") String ename, @Param("eaddress") String eaddress, @Param("esalary") int esalary);
	
	
	
	// select query
	
	@Query(value = "select * from employee where esalary < 5000" , nativeQuery = true)
	public List<EmployeeEntity> readMyData();
	
//	HQL
	@Query(value = "from EmployeeEntity")
	public List<EmployeeEntity> readMyAllData();
	// derived query
	
	public List<EmployeeEntity> findByEsalary(int esalary);
	
	
}
