package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;



public class ChangeSituationDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	public void ChangeSituation(String situation, int id){

		String sql ="UPDATE user_buy_item_transaction set situation = ? where id =?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, situation);
			ps.setInt(2, id);

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
