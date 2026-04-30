package com.kod.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		ResultSet res = null;
		
		String dpath = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/kodnestaug";
		
		String user = "root";
		String password = "Saurav@123";
		
		String sql = "select * from student where sid =?";
		
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			System.out.println("Enter id to fetch the data");
			int id = sc.nextInt();
			ps.setInt(1, id);
			
			res = ps.executeQuery();
			if(res.next())
			{
				System.out.println(res.getInt(1) + " " + res.getString(2)+ " "+res.getInt(3)+" " + res.getInt(4));
				
			} 
			else {
				System.out.println("Invalid id no student is there ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				if(res!=null) res.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
