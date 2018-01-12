package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import util.DBConnector;
import util.DateUtil;

public class ManagerCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public Map<String,Object> session;

	public String sql = "INSERT INTO Manager_transaction(login_id, login_pass, user_name, year, position, insert_date) VALUES(?,?,?,?,?,?)";



	public void createManager(String loginUserId, String loginUserPassword, String userName, String year, String position) {



		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, year);
			preparedStatement.setString(5, position);
			preparedStatement.setString(6, dateUtil.getDate());

			preparedStatement.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}


	}

}
