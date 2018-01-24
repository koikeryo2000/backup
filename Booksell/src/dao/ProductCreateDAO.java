package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBConnector;
import util.DateUtil;

public class ProductCreateDAO {
	 private DateUtil dateUtil = new DateUtil();

		private DBConnector dbConnector = new DBConnector();
		private Connection connection = dbConnector.getConnection();

		public String sql ="INSERT INTO item_info(item_name, item_price, item_stock, image, Category, Description, user_master_id, insert_date) VALUES(?,?,?,?,?,?,?,?)";

		public void createProduct(String itemName, int itemPrice, int itemStock,String image, String category, String description, String login_user_id ){
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setString(1, itemName);
				preparedStatement.setInt(2, itemPrice);
				preparedStatement.setInt(3, itemStock);
				preparedStatement.setString(4, image);
				preparedStatement.setString(5, category);
				preparedStatement.setString(6, description);
				preparedStatement.setString(7, login_user_id);
				preparedStatement.setString(8, dateUtil.getDate());

				preparedStatement.execute();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}


}
