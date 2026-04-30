package com.codeHunt.spring_CodeHunt1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperimpl implements RowMapper<Employee> {
	
	@Override
	public Employee mapRow(ResultSet rs, int rowCount) throws SQLException {
		 Employee employee = new Employee();
		 employee.setEid(rs.getInt("eid"));
		 employee.setEname(rs.getString("ename"));
		 employee.setEaddress(rs.getString("eaddress"));
		 employee.setEsalary(rs.getInt("esalary"));
		 
		 System.out.println("Row Mapped" + (rowCount+1));
		return employee;
	}
	
}
