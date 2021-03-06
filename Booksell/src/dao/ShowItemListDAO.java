package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.ItemDTO;
import util.DBConnector;
//import util.DateUtil;

public class ShowItemListDAO {

	ItemDTO itemDTO = new ItemDTO();

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	//private DateUtil dateUtil = new DateUtil();

	public ResultSet showItem(){
		 String sql ="SELECT * FROM item_info_transaction ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			return preparedStatement.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}



	}

	public ResultSet getPhoto(String id){
		String sql = "SELECT IMAGE FROM item_info_transaction WHERE ID=?";
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

