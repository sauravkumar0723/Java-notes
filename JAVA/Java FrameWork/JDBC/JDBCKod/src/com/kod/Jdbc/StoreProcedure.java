package com.kod.Jdbc;

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
		
		Scanner scan = new Scanner(System.in);
		
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/storeprocedure?user = root & password = Saurav@123";
		
		String sql = "call getstudent(?)";
		
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			
			cs = con.prepareCall(sql);
			
			System.out.println("Enter the marks to fetch the students marks above enterd marks");
			int marks = scan.nextInt();
			cs.setInt(1, marks);
			boolean res = cs.execute();
			
			if(res == true) {
				rs = cs.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + " "+ rs.getString(2) + " " + rs.getInt(3));
					
				}
			}
			else {
				int nora = cs.getUpdateCount();
				System.out.println(nora + "ROW(S) affected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
