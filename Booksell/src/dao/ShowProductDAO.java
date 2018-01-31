package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ProductDTO;
import util.DBConnector;

public class ShowProductDAO {



	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public ArrayList<ProductDTO> ShowProduct(){
		ArrayList<ProductDTO> productDTO = new ArrayList<ProductDTO>();

		String sql = "SELECT * FROM item_info";



		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getInt("item_price"));
				dto.setItemStock(resultSet.getInt("item_stock"));
				dto.setImage(resultSet.getString("image"));
				dto.setProduct(resultSet.getString("product"));
				dto.setCategory(resultSet.getString("Category"));
				dto.setDescription(resultSet.getString("Description"));
				dto.setLogin_user_id(resultSet.getString("user_master_id"));
				dto.setInsertdate(resultSet.getDate("insert_date"));
				productDTO.add(dto);

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

		return productDTO;
	}
	public ProductDTO showProduct(String Name){

		ProductDTO Dto = new ProductDTO();

		String sql2 ="SELECT * FROM item_info where item_name = ?";

		try {
			PreparedStatement ps =connection.prepareStatement(sql2);

			ps.setString(1, Name);

			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {

				Dto.setItemStock(resultSet.getInt("item_stock"));
				Dto.setItemStock(resultSet.getInt("item_stock"));

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {

		} catch (Exception e) {
			// TODO: handle exception
		}

		return Dto;

	}

}
