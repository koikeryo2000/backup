package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.UserDTO;
import util.DBConnector;

public class ShowUserDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	UserDTO UserDTO = new UserDTO();

	public UserDTO showUser(String loginId){

		String sql ="SELECT * FROM login_user_transaction where login_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, loginId);

			ResultSet resultSet =ps.executeQuery();

			while (resultSet.next()) {
				UserDTO.setLoginId(resultSet.getString("login_id"));
				UserDTO.setLoginPass(resultSet.getString("login_pass"));
				UserDTO.setUserName(resultSet.getString("year"));
				UserDTO.setStreetAddress(resultSet.getString("street_address"));
				UserDTO.setSex(resultSet.getString("sex"));
				UserDTO.setPhoneNumber(resultSet.getString("phone_number"));
				UserDTO.setMailAddress(resultSet.getString("mail_address"));
				UserDTO.setWallet(resultSet.getInt("wallet"));


			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return UserDTO;

	}
}
