package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ChageWalletDAO;
import dto.WalletDTO;

public class ChargeWalletAction extends ActionSupport implements SessionAware {

	private WalletDTO walletDTO = new WalletDTO();

	public Map<String,Object> session;

	private String NetMoneyNumber;

	private ChageWalletDAO chagewalletDAO = new ChageWalletDAO();

	 String used ="使用不可";

	 private int UserWalet;
	 private int NetMoney ;
	 private int totalUserWallet;
	 private String id;

	 private String ErrorMsg ;




	public String execute(){
		String result =ERROR;

		walletDTO = chagewalletDAO.showNetMoney(NetMoneyNumber);

		if ((walletDTO).getFlg()) {



			if (walletDTO.getUsed().equals("使用可")) {
				String used ="使用不可";

				chagewalletDAO.ManagerWalletChageUpdate(used,session.get("loginUserId").toString(),NetMoneyNumber);
				session.get("UserWallet");
				 UserWalet = Integer.parseInt(session.get("UserWallet").toString());
				 NetMoney = Integer.parseInt(walletDTO.getPrice());


				totalUserWallet = UserWalet + NetMoney;


				id = session.get("loginUserId").toString();

				System.out.println("idの値"+id);
				session.put("id", id);
				session.put("NetMoney", NetMoney);
				session.put("UserWalet", UserWalet);
				session.put("totalUserWallet", totalUserWallet);


				System.out.println("loginIdの値"+session.get("loginUserId"));
				System.out.println("totalの値" + totalUserWallet);

				chagewalletDAO.UserWalletChageUpdate(totalUserWallet, session.get("loginUserId").toString());
				result =SUCCESS;
			}else {
				walletDTO.setErrorMsg("登録しようとしたNetMoneyは使用済みのため登録できません");
			}
		}

		System.out.println("エラー原因"+walletDTO.getErrorMsg());

		ErrorMsg = walletDTO.getErrorMsg();

		session.put("errorMsg", ErrorMsg);
		session.put("errormsg", walletDTO.getErrorMsg());

		return result;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getNetMoneyNumber() {
		return NetMoneyNumber;
	}

	public void setNetMoneyNumber(String netMoneyNumber) {
		NetMoneyNumber = netMoneyNumber;
	}

	public int getUserWalet() {
		return UserWalet;
	}

	public void setUserWalet(int userWalet) {
		UserWalet = userWalet;
	}

	public int getNetMoney() {
		return NetMoney;
	}

	public void setNetMoney(int netMoney) {
		NetMoney = netMoney;
	}

	public int getTotalUserWallet() {
		return totalUserWallet;
	}

	public void setTotalUserWallet(int totalUserWallet) {
		this.totalUserWallet = totalUserWallet;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getErrorMsg() {
		return ErrorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		ErrorMsg = errorMsg;
	}

}
