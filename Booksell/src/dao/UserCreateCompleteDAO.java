package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;
import util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	 private Connection connection = dbConnector.getConnection();

	 private DateUtil dateUtil = new DateUtil();

	 public String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name, year, street_address, sex, phone_number,insert_date) VALUES(?,?,?,?,?,?,?,?)";



	 public void cerateUser(String loginUserId, String loginUserPassword, String userName, String year,String streetAddress,String sex, String phoneNumber) throws SQLException{

		 try {
			 System.out.println(sql+"sql文チェック");
			 //sql文実行＆値を受け取りsetする
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, year);
			preparedStatement.setString(5, streetAddress);
			preparedStatement.setString(6, sex);
			preparedStatement.setString(7, phoneNumber);
			preparedStatement.setString(8, dateUtil.getDate());


			System.out.println(sql +"sql文チェック");

			preparedStatement.execute();




		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

	 }



}
