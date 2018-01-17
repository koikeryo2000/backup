package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnector;

public class RetrieveIamgesDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();




	public ResultSet getData(){

		String sql = "SELECT name,id FROM image_upload";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			return preparedStatement.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}
	public ResultSet getPhoto(String id){
		String sql = "SELECT IMAGE FROM image_upload WHERE ID=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, id);
			return ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
