package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;
import util.DateUtil;
import util.NetMoneyCode;

public class NetMoneyCreateCompleteDAO  {

	private DBConnector dbConnector = new DBConnector();

	 private Connection connection = dbConnector.getConnection();

	 private DateUtil dateUtil = new DateUtil();

	 private NetMoneyCode Moneycode = new NetMoneyCode();

	 public  String sql = "INSERT INTO net_money (net_money_code, price, used, Manager_master_id, insert_date) VALUES(?, ?, ?, ?, ?)";

	 private String used="使用可";

	 public void CreateNetMoney(String price, String ManagerId){






		 try {


			 System.out.println("DAO"+ManagerId);
			 System.out.println(price);

			PreparedStatement preparedStatement =connection.prepareStatement(sql);

			preparedStatement.setString(1, Moneycode.getNetMoneyCode());
			preparedStatement.setString(2, price);
			preparedStatement.setString(3, used);
			preparedStatement.setString(4, ManagerId);
			preparedStatement.setString(5, dateUtil.getDate());

			preparedStatement.execute();


		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}



	 }
		public void test(String price,String ManagerId){
			String sql2 ="INSERT INTO net_money (net_money_code, price, Manager_master_id, insert_date) VALUES(?, ?, ?, ?)";

			try {
				PreparedStatement ps = connection.prepareStatement(sql2);
				ps.setString(1, Moneycode.getNetMoneyCode());
				ps.setString(2, price);
				ps.setString(3, ManagerId);
				ps.setString(4, dateUtil.getDate());

				ps.execute();


			} catch (Exception e) {
				// TODO: handle exception
			}
		}

}
