package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.BuyingHistoryDTO;
import util.DBConnector;

public class BuyingHistoryDAO {



	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public ArrayList<BuyingHistoryDTO> ShowBuyingHistory(String loginid){
		ArrayList<BuyingHistoryDTO> BuyHistorydto = new ArrayList<BuyingHistoryDTO>();

		String sql ="SELECT * FROM user_buy_item_transaction where user_master_id = ? ";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, loginid);


			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BuyingHistoryDTO bhDTO = new BuyingHistoryDTO();
				bhDTO.setItemName(rs.getString("item_name"));
				bhDTO.setPrice(rs.getInt("price"));
				bhDTO.setStock(rs.getInt("stock"));
				bhDTO.setTotalPrice(rs.getInt("total_price"));
				bhDTO.setUserTotalPrice(rs.getInt("user_total_price"));
				bhDTO.setPay(rs.getString("pay"));
				bhDTO.setImage(rs.getString("image"));
				bhDTO.setSituation(rs.getString("situation"));
				bhDTO.setLoginId(rs.getString("user_master_id"));
				bhDTO.setBuyDate(rs.getDate("insert_date"));

				BuyHistorydto.add(bhDTO);



			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return BuyHistorydto;

	}
	public ArrayList<BuyingHistoryDTO> ShowUserBuyingHistory(String situation){
		ArrayList<BuyingHistoryDTO> BuyHistoryDto = new ArrayList<BuyingHistoryDTO>();

		String sql2 ="SELECT * FROM user_buy_item_transaction where situation= ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql2);
			ps.setString(1, situation);


			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BuyingHistoryDTO bhDTO = new BuyingHistoryDTO();
				bhDTO.setId(rs.getInt("id"));
				bhDTO.setItemName(rs.getString("item_name"));
				bhDTO.setPrice(rs.getInt("price"));
				bhDTO.setStock(rs.getInt("stock"));
				bhDTO.setImage(rs.getString("image"));
				bhDTO.setSituation(rs.getString("situation"));
				bhDTO.setUserName(rs.getString("user_master_id"));
				bhDTO.setBuyDate(rs.getDate("insert_date"));
				BuyHistoryDto.add(bhDTO);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return BuyHistoryDto;
	}

}
