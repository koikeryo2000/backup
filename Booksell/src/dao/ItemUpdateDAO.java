package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;
import util.DateUtil;

public class ItemUpdateDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public void ItemUpdate(String column, String change, String itemName ,String userid){
		String sql ="UPDATE item_info_transaction set " + column + " = ?, update_date = ?, user_master_id = ? where item_name = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, change);
			preparedStatement.setString(2, dateUtil.getDate());
			preparedStatement.setString(3, userid);
			preparedStatement.setString(4, itemName);

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
