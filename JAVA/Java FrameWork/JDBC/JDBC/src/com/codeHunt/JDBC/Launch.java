package com.codeHunt.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Launch {
	public static void main(String[] args) {
		try {
			// MY SQL DRIVER lOADED AND REGISTERED
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="Jdbc:mysql://localhost:3306";
			String username="root";
			String password="Saurav@123";
			// Factory design Pattern
			Connection con= DriverManager.getConnection(url,username,password);
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
