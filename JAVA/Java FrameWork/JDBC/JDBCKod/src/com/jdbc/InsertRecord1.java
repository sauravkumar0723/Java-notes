package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecord1 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String sql = "insert into student value(?,?,?,?,?,?,?)";
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/collage";
		String user = "root";
		String password = "Saurav@123";
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			System.out.println("Enter sid, name,gender,section,age marks, pno");
			int sid = sc.nextInt();
			ps.setInt(1, sid);
			
			String name = sc.next();
			ps.setString(2, name);
			
			String gender = sc.next();
			ps.setString(3, gender);
			
			String section = sc.next();
			ps.setString(4, section);
			
			int age = sc.nextInt();
			ps.setInt(5, age);
			
			int marks = sc.nextInt();
			ps.setInt(6, marks);
			
			int pno = sc.nextInt();
			ps.setInt(7, pno);
			int nora = ps.executeUpdate();
			System.out.println(nora + "Row(s) inserted");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(ps != null)  ps.close();
				if(sc != null) sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
