package tech.codehunt.crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static final String DB_URL="Jdbc:mysql:/localhost:3306/maybatch";
	private static final String DB_USER="root";
	private static final String DB_PASSWORD="Saurav@123";
	
	public static Connection getConnection() {
		
		Connection connection = null;
		try {
			connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}
