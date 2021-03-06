package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.UserInformationDTO;
import util.DBConnector;

public class ShowUserInformationDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	public ArrayList<UserInformationDTO> getUserInfo(String loginId){

		ArrayList<UserInformationDTO> userInfoDTO = new ArrayList<UserInformationDTO>();

		String sql ="SELECT * FROM login_user_transaction where login_id = ? ";

		System.out.println("MapからちゃんとloginIdが渡されてるかチェック"+loginId);


		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				UserInformationDTO userInformationDTO = new UserInformationDTO();


				userInformationDTO.setLoginId(resultSet.getString("login_id"));
				userInformationDTO.setLoginpass(resultSet.getString("login_pass"));
				userInformationDTO.setUserName(resultSet.getString("user_name"));
				userInformationDTO.setYear(resultSet.getString("year"));
				userInformationDTO.setStreetAddress(resultSet.getString("street_address"));
				userInformationDTO.setSex(resultSet.getString("sex"));
				userInformationDTO.setPhoneNumber(resultSet.getString("phone_number"));
				userInformationDTO.setMailAddress(resultSet.getString("mail_address"));
				userInfoDTO.add(userInformationDTO);

				System.out.println("メールアドレスがちゃんと取得できてるかチェック"+userInformationDTO.getMailAddress());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}



		return userInfoDTO;

	}






}
