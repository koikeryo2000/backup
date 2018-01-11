package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnector;
import util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	 private Connection connection = dbConnector.getConnection();

	 private DateUtil dateUtil = new DateUtil();

	 public String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name, year, street_address, sex, phone_number,mail_address, insert_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";



	 public void cerateUser(String loginUserId, String loginUserPassword, String userName, String year,String streetAddress,String sex, String phoneNumber, String mailAddress) throws SQLException{

		 try {

			 System.out.println("日付チェック"+dateUtil.getDate());
			 System.out.println("受け渡された値チェック"+ loginUserId+loginUserPassword+userName+year+streetAddress+sex +phoneNumber+mailAddress);

			 System.out.println(sql+"sql文チェック");
			 //sql文実行＆値を受け取りsetする
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, year);
			preparedStatement.setString(5, streetAddress);
			preparedStatement.setString(6, sex);
			preparedStatement.setString(7, phoneNumber);
			preparedStatement.setString(8, mailAddress);
			preparedStatement.setString(9, dateUtil.getDate());


			System.out.println(sql +"sql文チェック");

			preparedStatement.execute();




		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		}

		 public void selectAll() {
				DBConnector db = new DBConnector();
				Connection con = db.getConnection();

				String sql ="select * from login_user_transaction";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getString("login_id"));
						System.out.println(rs.getString("login_pass"));
						System.out.println(rs.getString("user_name"));
						System.out.println(rs.getString("year"));
						System.out.println(rs.getString("street_address"));
						System.out.println(rs.getString("sex"));
						System.out.println(rs.getString("phone_number"));
						System.out.println(rs.getString("mailAddress"));

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}



	 }



}
