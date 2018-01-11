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
		String mailAddress;



		loginUserId ="tanaka3";
		loginUserPassword="61613";
		userName="田中3";
		year ="363";
		streetAddress="東京3";
		sex="男";
		phoneNumber="61613";
		mailAddress="ryoinu8@yahoo.co.jp";

		DBConnector dbconnector = new DBConnector();

		UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

		dbconnector.getConnection();

		try {
			dao.cerateUser(loginUserId, loginUserPassword, userName, year, streetAddress, sex, phoneNumber,mailAddress);

			System.out.println("全件表示↓");

			dao.selectAll();
		} catch (SQLException e) {
			System.out.println("エラー発生");
			e.printStackTrace();
		}
		System.out.println("dao正常に作動");
	}



}
