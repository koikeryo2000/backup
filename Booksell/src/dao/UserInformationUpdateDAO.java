package dao;

import java.sql.Connection;

import dto.LoginDTO;
import util.DBConnector;

public class UserInformationUpdateDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword, String userName ){
		return loginDTO;

	}
}
