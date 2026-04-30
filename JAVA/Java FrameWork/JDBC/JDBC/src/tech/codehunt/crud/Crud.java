package tech.codehunt.crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud {
	
	
	
	public Crud() {
		// table creation
	}
	
	public void createTable() {
		Connection connection=null;
		Statement statement = null;
		try {
			connection = ConnectionFactory.getConnection(); // connection mangae
			String sql="CREATE TABLE IF NOT EXIST employee(sn INT AUTO_INCREMENT PRIMARY KEY,"
					+ "USERNAME VARCHAR(30) NOT NULL UNIQUE,"
					+ "PASSWORD VARCHAR(30),"
					+ "FULLNAME VARCHAR(100),"
					+ "ADDRESS VARCHAR(200),"
					+ "SALARY int );";
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("Table created");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void insert() {
		Connection connection = ConnectionFactory.getConnection();
		System.out.println(connection);
	}
	public void read() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
	
	
}
