package com.kod.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		
        Scanner sc = new Scanner(System.in);
        String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/transcation?user = root & password = Saurav@123";
		
		String sql1 = "update bank set balance = balance - ? where id = ? and password = ?";
		String sql2 = "update bank set balance = balance + ? where id = ?";

		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps1 = con.prepareStatement(sql1);
			ps2 = con.prepareStatement(sql2);
			System.out.println("Enter from account number and password : ");
			int facnum = sc.nextInt();
			String pwd = sc.next();
			System.out.println("Enter toAcNum :");
			int toacnum = sc.nextInt();
			System.out.println("Enter amount to transfer");
			int amount = sc.nextInt();
			
			ps1.setInt(1, amount);
			ps1.setInt(2, facnum);
			ps1.setString(3, pwd);
			ps2.setInt(1, amount);
			ps2.setInt(2, toacnum);
			
			int nora1 = ps1.executeUpdate();
			System.out.println(nora1 + "row(s) affected");
			
			int nora2 = ps2.executeUpdate();
			System.out.println(nora2 + " rows(2) affected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) con.close();
				if(ps1!=null) ps1.close();
				if(ps2!=null) ps2.close();
				if(sc!=null) sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
