package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
  public static void main(String[] args) {
	        try {
	            // Step 1 Load Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver Loaded");

	            // Step 2 Establish Connection
	            Connection con = DriverManager.getConnection(
	            		"jdbc:mysql://localhost:3306/KodNest",
	                    "root",
	                    "Saurav@123");

	            System.out.println("Connection Established");

	            // Step 3 Create Statement
	            Statement stmt = con.createStatement();
	            System.out.println("Statement Created");

	            // Step 4 Execute Query
	            String sql = "select * from Student";
	            ResultSet rs = stmt.executeQuery(sql);
	            System.out.println("Query Executed");
	            
	            //Step5 Display the result        
	            while(rs.next()) {
	            	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
	            }     
	            //step 6
	            con.close();
	            stmt.close();
	            rs.close();
	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

