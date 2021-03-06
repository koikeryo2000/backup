package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;
import util.DateUtil;

public class UnsubscribeDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	 private DateUtil dateUtil = new DateUtil();



	public void deleteUser(String loginUserId){
		 String sql ="DELETE FROM login_user_transaction WHERE login_id = ?";


		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	public void Unsubscribe(String loginUserId, String why, String reason){
		String sql2 ="INSERT INTO unsubscribe(user_master_id, why, reason, insert_date) VALUES(?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql2);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, why);
			preparedStatement.setString(3, reason);
			preparedStatement.setString(4, dateUtil.getDate());
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("退会理由のDBエラー");
		}
	}

}
