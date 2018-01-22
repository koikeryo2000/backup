package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;

public class UserUpdateDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public void UserUpdate(String column, String change, String userId){

		String sql = "UPDATE login_user_transaction set "+ column +" = ? where login_id = ?";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//preparedStatement.setString(1, column);
			preparedStatement.setString(1, change);
			preparedStatement.setString(2, userId);

			preparedStatement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
