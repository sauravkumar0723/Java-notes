package com.kod.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		
        String dpath = "com.mysql.cj.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/jdbcinsert?user = root & password = Saurav@123";
		
		String sql = "delete from employee where id = ?";
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter id to to delete student");
			int id = sc.nextInt();
			ps.setInt(1, id);
			
			int nora =ps.executeUpdate();
			System.out.println(nora + "Rows Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				if(sc!=null) sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
