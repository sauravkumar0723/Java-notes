package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

public class ObjectFactory {
	
	private Account account;
	
	
	
	
	public void setAccount(Account account) {
		this.account = account;
	}




	public  Employee getObject() {
		Employee employee = new Employee();
		employee.setId(UUID.randomUUID().toString());
		
		employee.setAccount(account);
		
		return employee;
	}
}
