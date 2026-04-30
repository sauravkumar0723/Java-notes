package com.codeHunt.spring_CodeHunt1;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private int an=10;
	private String bankName= "xyzbank";
	
	public Account() {
		System.out.println("Account bean Instantiation: zero parameterized constructor");
	}

	public Account(int an, String bankName) {
		super();
		System.out.println("Account bean Instantiation: parameterized constructor");
		this.an = an;
		this.bankName = bankName;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Account [an=" + an + ", bankName=" + bankName + "]";
	}
}
