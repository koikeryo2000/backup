package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.BuyDTO;
import util.DBConnector;

public class UserBuyInfoDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	BuyDTO buyDTO = new BuyDTO();


public ArrayList<BuyDTO> ShowUserBuyInfo(String loginId){
	ArrayList<BuyDTO> buyDTO = new ArrayList<BuyDTO>();

	String sql ="SELECT * FROM user_buy_item_transaction where user_master_id = ? ";

	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, loginId);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			BuyDTO dto = new BuyDTO();
			dto.setProductName(rs.getString("item_name"));
			dto.setPrice(rs.getInt("price"));
			dto.setStock(rs.getInt("stock"));
			dto.setUserTotalPrice(rs.getInt("user_total_price"));
			dto.setPay(rs.getString("pay"));
			dto.setImage(rs.getString("image"));
			dto.setSituation(rs.getString("situation"));
			buyDTO.add(dto);

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

	return buyDTO;

}
}

