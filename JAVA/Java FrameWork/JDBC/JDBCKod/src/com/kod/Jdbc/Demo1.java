package com.kod.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		try {
			//step 1:- load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			//step 2:- Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnestaug", "root", "Saurav@123");
			System.out.println("Connection establish");
			
			// Step 3:- create statement
			Statement statment = con.createStatement();
			System.out.println("Statment created");
			
			// Step4:- Execute Query
			String sql = "select * from student";
			ResultSet rs = statment.executeQuery(sql);
			System.out.println("Query executed");
			
			//Step5 Display the result        
            while(rs.next()) {
            	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }     
            //step 6 close() the connection
            con.close();
            statment.close();
            rs.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
