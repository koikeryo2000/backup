package com.internousdev.webproj2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//jdbcドライバ

	private static String DriverName="com.mysql.jdbc.Driver";

	//データベース接続URL

	private static String url ="jdbc:mysql://localhost/testdb";

	//データベース接続ユーザ名

	private static String user="root";

	//データベース接続パスワード

	private static String password="mysql";

	public Connection getConnection(){

		Connection con =null;

		try {
			Class.forName(DriverName);
			con=DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return con;

	}

}