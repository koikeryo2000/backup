package dao;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;
import util.DateUtil;

public class ItemCreateDAO {

	 private DateUtil dateUtil = new DateUtil();

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public String sql ="INSERT INTO item_info_transaction(item_name, item_price, item_stock, image, Category, Description, insert_date) VALUES(?,?,?,?,?,?,?)";

	public void createItem(String itemName, int itemPrice, int itemStock,File image, String category, String description ){
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, itemName);
			preparedStatement.setInt(2, itemPrice);
			preparedStatement.setInt(3, itemStock);
			FileInputStream inputStream = new FileInputStream(image);
			preparedStatement.setBinaryStream(4, inputStream);
			preparedStatement.setString(5, category);
			preparedStatement.setString(6, description);
			preparedStatement.setString(7, dateUtil.getDate());

			preparedStatement.execute();





		} catch (SQLException e) {

		} catch (FileNotFoundException e) {
			System.out.println("ファイルエラー");
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
