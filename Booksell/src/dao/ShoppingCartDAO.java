package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ShoppingCartDTO;
import util.DBConnector;
import util.DateUtil;

public class ShoppingCartDAO {
	private DateUtil dateUtil = new DateUtil();

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public String sql ="INSERT INTO shopping_cart(item_name, price, stock, total, image, user_master_id, insert_date) VALUES(?,?,?,?,?,?,?)";

	int tol;

	public void createShoppingCart(String itemName, int itemprice, int itemstock, int total, String image, String userId){

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, itemName);
			preparedStatement.setInt(2, itemprice);
			preparedStatement.setInt(3, itemstock);
			preparedStatement.setInt(4, total);
			preparedStatement.setString(5, image);
			preparedStatement.setString(6, userId);
			preparedStatement.setString(7, dateUtil.getDate());

			preparedStatement.execute();


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<ShoppingCartDTO> SearchShoppingCart(String userId){

		ArrayList<ShoppingCartDTO> shoppingList = new ArrayList<ShoppingCartDTO>();

		String sql ="SELECT * FROM shopping_cart WHERE user_master_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, userId);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ShoppingCartDTO dto = new ShoppingCartDTO();
				dto.setItemName(resultSet.getString("item_name"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setStock(resultSet.getInt("stock"));
				dto.setImage(resultSet.getString("image"));
				dto.setUserId(resultSet.getString("user_master_id"));
				dto.setInsertdate(resultSet.getDate("insert_date"));
				shoppingList.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return shoppingList;
	}
	public void cerateCart(String ItemName,int price, int stock,int total, String image, String id){
		String sql ="INSERT INTO shopping_cart (item_name, price, stock, total, image, user_master_id,insert_date) VALUES(?, ?, ?, ?, ?, ?, ?)";

		System.out.println("引数チェック"+ItemName+price+stock+image+id);

		try {
			PreparedStatement ps =connection.prepareStatement(sql);
			ps.setString(1, ItemName);
			ps.setInt(2, price);
			ps.setInt(3, stock);
			ps.setInt(4, total);
			ps.setString(5, image);
			ps.setString(6, id);
			ps.setString(7, dateUtil.getDate());

			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public ShoppingCartDTO gettotal(String id){
		ArrayList<ShoppingCartDTO> ShoppingList = new ArrayList<ShoppingCartDTO>();
		ShoppingCartDTO Dto = new ShoppingCartDTO();
		String sql ="SELECT * FROM shopping_cart WHERE user_master_id = ?";

		System.out.println("DAOの値チェック"+id);

		try {
			PreparedStatement pdst =connection.prepareStatement(sql);
			pdst.setString(1, id);

			ResultSet rtSt = pdst.executeQuery();

			while (rtSt.next()) {


				tol +=rtSt.getInt("total");
				//Dto.setTotal(rtSt.getInt("total"));
				System.out.println(tol);

				//ShoppingList.add(Dto);
			}
			Dto.setTotal(tol);
			//ShoppingList.add(Dto);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Dto;

	}


}



