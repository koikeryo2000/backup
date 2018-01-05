package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/booksell";
	private static String user = "root";
	private static String password = "mysql";
public Connection getConnection() {
	Connection con = null;
	try {
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);
	} catch(ClassNotFoundException e) {
		System.out.println("接続に失敗");

		e.printStackTrace();
	} catch(SQLException e) {
		System.out.println("接続に失敗");
		e.printStackTrace();
	}

	System.out.println("成功");

	return con;
	}
}