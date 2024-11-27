package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static Connection conn=null;
	public static Connection getConnection() {
		if (conn==null) {
			String url = "jdbc:mysql://localhost:3306/jdbcdemo";
			String uname="root";
			String pw="root";
			try {
				conn = DriverManager.getConnection(url,uname,pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
