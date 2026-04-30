package com.kod.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecord {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String sql = "insert into employee values(?,?,?,?)";
		
        String dpath = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/jdbcinsert";
		
		String user = "root";
		String password = "Saurav@123";
		
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url,user,password);
			
			ps = con.prepareStatement(sql);
			System.out.println("Enter id, name, gender and salary");
			
			int id = sc.nextInt();
			String name = sc.next();
			String gender = sc.next();
			int salary = sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, gender);
			ps.setInt(4, salary);
			
			int nora = ps.executeUpdate();
			
			System.out.println(nora + "Row(s) inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(con!=null) con.close();
				if(ps!=null) ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
