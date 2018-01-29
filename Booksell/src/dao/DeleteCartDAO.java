package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;

public class DeleteCartDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public void deleteCart(int id){

		String sql="DELETE FROM shopping_cart WHERE id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void alldeleteCart(String loginId){
		String sql2="DELETE FROM shopping_cart WHERE user_master_id = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql2);
			ps.setString(1, loginId);

			ps.execute();
		} catch (Exception e) {

		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}


}
