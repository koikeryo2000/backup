package dao;

import java.sql.SQLException;

import util.DBConnector;

public class Test {






	public static void main(String[] args) {

		String loginUserId;
		String loginUserPassword;
		String userName;
		String year;
		String streetAddress;
		String sex;
		String phoneNumber;

		loginUserId ="koike";
		loginUserPassword="1234";
		userName="小池";
		year ="24";
		streetAddress="中野";
		sex="男";
		phoneNumber="1234";

		DBConnector dbconnector = new DBConnector();

		UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

		dbconnector.getConnection();

		try {
			dao.cerateUser(loginUserId, loginUserPassword, userName, year, streetAddress, sex, phoneNumber);
		} catch (SQLException e) {
			System.out.println("エラー発生");
			e.printStackTrace();
		}
		System.out.println("dao正常に作動");
	}

}