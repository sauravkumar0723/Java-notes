package com.KodNest.JdbcProject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class StoreProcedure {
	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/firstdb?user = root & password = root";
		String sql = "update bank set balance = balance - ? where acnum = ? and password = ?";
		
		try {
			Class.forName(dpath);

			con = DriverManager.getConnection(url);
			
			cs = con.prepareCall(sql);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
