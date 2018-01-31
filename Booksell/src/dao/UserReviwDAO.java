package dao;

import java.sql.Connection;

import util.DBConnector;
import util.DateUtil;

public class UserReviwDAO {
	private DBConnector dbConnector = new DBConnector();

	 private Connection connection = dbConnector.getConnection();

	 private DateUtil dateUtil = new DateUtil();



	 public void CreateUserReviw(String itemName){

		 String sql ="INSERT INTO user_review (Review, item_name, rank,flag, user_master_id, insert_date)  VALUES(?, ?, ?, ?, ?, ?)";

		 try {

		} catch (Exception e) {
			// TODO: handle exception
		}

	 }
}
