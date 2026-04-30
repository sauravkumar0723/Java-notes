package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet res = null;
		Scanner sc = new Scanner(System.in);
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/KodNest";
		String user = "root";
		String password = "Saurav@123";
		String sql = "select * from Student where id = ? and name = ?";
		
		try {
			
			Class.forName(dpath); //Load Driver
			con = DriverManager.getConnection(url,user,password); // Established Connection
			ps = con.prepareStatement(sql); // create statement
			System.out.println("Enter id to fetch data: ");
			int sid = sc.nextInt();
			ps.setInt(1,sid);
			System.out.println("Enter the name");
			String name = sc.next();
			ps.setString(2, name);
			res = ps.executeQuery(); // execute Query
			
			if(res.next()) { // display result
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3) + " ");
			} else {
				System.out.println("Invalid id");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null) con.close();
				if(ps != null)  ps.close();
				if(res != null) res.close();
				if(sc != null) sc.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}