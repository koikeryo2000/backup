package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.UnsubscribeDTO;
import util.DBConnector;

public class UnsubscribeListDAO {



	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	public ArrayList<UnsubscribeDTO> showUnsubscribe(){
		ArrayList<UnsubscribeDTO> unsubscribeList = new ArrayList<UnsubscribeDTO>();

		String sql ="SELECT * FROM unsubscribe ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				UnsubscribeDTO unsubscribeDTO = new UnsubscribeDTO();
				unsubscribeDTO.setUserName(resultSet.getString("user_master_id"));
				unsubscribeDTO.setWhy(resultSet.getString("why"));
				unsubscribeDTO.setReason(resultSet.getString("reason"));
				unsubscribeDTO.setDate(resultSet.getDate("insert_date"));
				unsubscribeList.add(unsubscribeDTO);
			}



		} catch (SQLException e) {
			e.printStackTrace();
		}

		return unsubscribeList;

	}

}
