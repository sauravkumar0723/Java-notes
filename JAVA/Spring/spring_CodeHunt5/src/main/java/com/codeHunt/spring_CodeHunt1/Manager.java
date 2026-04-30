package com.codeHunt.spring_CodeHunt1;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Manager {
	
	private String url;
	private String countryCode;
	private int mid;
	
	public  Manager() {
		System.out.println("Manager bean Instantiation");
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Manager [url=" + url + ", countryCode=" + countryCode + ", mid=" + mid + "]";
	}
	
	
	
	

}
