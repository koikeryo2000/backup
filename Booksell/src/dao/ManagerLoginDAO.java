package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.ManagerLoginDTO;
import util.DBConnector;

public class ManagerLoginDAO {


	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ManagerLoginDTO managerloginDTO = new ManagerLoginDTO();

	public ManagerLoginDTO getLoginManager(String loginUserId, String loginPassword){

		String sql = "SELECT * FROM Manager_transaction where login_id = ? AND login_pass = ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				managerloginDTO.setLoginId(resultSet.getString("login_id"));
				managerloginDTO.setLoginPassword(resultSet.getString("login_pass"));
				managerloginDTO.setUserName(resultSet.getString("user_name"));
				managerloginDTO.setPosition(resultSet.getString("position"));

				System.out.println(managerloginDTO.getUserName());

				if (!(resultSet.getString("login_id").equals(null))) {
					managerloginDTO.setLoginFlg(true);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}




		return managerloginDTO;

	}
}
