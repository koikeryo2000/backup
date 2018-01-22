package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;

public class ItemUpdateDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public void ItemUpdate(String column, String change, String itemName){
		String sql ="UPDATE item_info_transaction set " + column + " = ? where item_name = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, change);
			preparedStatement.setString(2, itemName);

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
