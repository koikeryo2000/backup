package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.WalletDTO;
import util.DBConnector;
import util.DateUtil;

public class ChageWalletDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private WalletDTO walletDTO = new WalletDTO();

	public WalletDTO showNetMoney(String NetMoneyNumber){

		String sql = "SELECT * FROM net_money where net_money_code = ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, NetMoneyNumber);

			ResultSet resultSet = preparedStatement.executeQuery();



			if (resultSet.next()) {
				walletDTO.setPrice(resultSet.getString("price"));
				walletDTO.setUsed(resultSet.getString("used"));

				if (!(resultSet.getString("price").equals(null))) {
					walletDTO.setFlg(true);
				}
			}else {
				walletDTO.setErrorMsg("NetMoneyの番号が間違ってるため登録できません。");
			}
			//if (!(resultSet.getString("price").equals(null))) {
				//walletDTO.setFlg(true);
			//}

System.out.println("エラー原因"+ walletDTO.getErrorMsg());


		} catch (Exception e) {
			e.printStackTrace();
		}

		return walletDTO;


	}
	public void ManagerWalletChageUpdate(String used,String UserId, String NetMoneyNumber){
		String sql2 ="UPDATE net_money set used = ?,user_master_id = ?, used_date = ?  where net_money_code = ?";




		try {
			PreparedStatement ps = connection.prepareStatement(sql2);
			ps.setString(1, used);
			ps.setString(2, UserId);
			ps.setString(3, dateUtil.getDate());
			ps.setString(4, NetMoneyNumber);

			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

		}
	public void UserWalletChageUpdate(int UserTotalPrice, String loginId){
		String sql3 ="UPDATE login_user_transaction set wallet = ?, updated_date = ?  where login_id = ?";

		try {
			PreparedStatement pdst = connection.prepareStatement(sql3);
			pdst.setInt(1, UserTotalPrice);
			pdst.setString(2, dateUtil.getDate());
			pdst.setString(3, loginId);

			pdst.execute();

		} catch (Exception e) {

		}






	}

	}




