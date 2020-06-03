package org.comstudy21.sqlconn;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_test {

	public static Connection getConnection() {
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			System.out.println("드라이브 연결");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		return conn;

	}

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				
			}
		}
	}
	
	public static void close() {
		

	}
	
	public static void close() {
		
	}
	

}
