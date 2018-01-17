package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;

public class ImageCreateDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	public String sql= "INSERT INTO image_upload(name,image) VALUES(?,?)";

	public void createImage(String name, File image){

		try {
			PreparedStatement preparedStatement  = connection.prepareStatement(sql);

			preparedStatement.setString(1, name);
			FileInputStream inputStream = new FileInputStream(image);
			preparedStatement.setBinaryStream(2, inputStream);

			preparedStatement.execute();

			System.out.println("imageの値"+image);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}
