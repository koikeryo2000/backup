package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.SearchPasswordDTO;
import util.DBConnector;

public class SearchPasswordDAO {


	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private SearchPasswordDTO serchPasswordDTO = new SearchPasswordDTO();

	public List<SearchPasswordDTO> searchDTOList = new ArrayList<SearchPasswordDTO>();

	//public List<SearchPasswordDTO> getPassword(String loginUserId,String userName, String phoneNumber, String mailAddress ){

	public SearchPasswordDTO getPassword(String loginUserId,String userName, String phoneNumber, String mailAddress ){


		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND user_name = ? AND phone_number = ? AND mail_address = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, userName);
			preparedStatement.setString(3, phoneNumber);
			preparedStatement.setString(4, mailAddress);

			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				serchPasswordDTO.setLoginpass(resultSet.getString("login_pass"));

				//searchDTOList.add(serchPasswordDTO);





			if (!(serchPasswordDTO.getLoginpass().equals(null))) {
				System.out.println("loginpassがnull");

				serchPasswordDTO.setSearchFlg(true);
				//searchDTOList.add(serchPasswordDTO);



			}

				//if (!(resultSet.getString("login_pass").equals(null))) {
					//serchPasswordDTO.setSearchFlg(true);

					//System.out.println(serchPasswordDTO.getSearchFlg());
				//}

			}


		} catch (SQLException e) {
			e.printStackTrace();


		}
		//return searchDTOList;
		return serchPasswordDTO;





	}

	public DBConnector getDbConnector() {
		return dbConnector;
	}

	public void setDbConnector(DBConnector dbConnector) {
		this.dbConnector = dbConnector;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public SearchPasswordDTO getSerchPasswordDTO() {
		return serchPasswordDTO;
	}

	public void setSerchPasswordDTO(SearchPasswordDTO serchPasswordDTO) {
		this.serchPasswordDTO = serchPasswordDTO;
	}

	public List<SearchPasswordDTO> getSearchDTOList() {
		return searchDTOList;
	}

	public void setSearchDTOList(List<SearchPasswordDTO> searchDTOList) {
		this.searchDTOList = searchDTOList;
	}
}
