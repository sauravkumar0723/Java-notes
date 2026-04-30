package com.codeHunt.spring_CodeHunt1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("1000")
	private int eid;
	@Value("Saurav")
	private String ename;
	
	@Value("${db.url}")
	private String url;
	
	public Employee() {
		System.out.println("Emp bean Inst: zpc");
	}

	public Employee(int eid, String ename, String url) {
		super();
		System.out.println("Emp bean Inst: pc");
		this.eid = eid;
		this.ename = ename;
		this.url = url;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		System.out.println("Emp bean setter: eid");
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("Emp bean setter: ename");
		this.ename = ename;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("Emp bean setter: url");
		this.url = url;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", url=" + url + "]";
	}

}
