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


	public String execute(){
		String result =ERROR;

		walletDTO = chagewalletDAO.showNetMoney(NetMoneyNumber);

		if ((walletDTO).getFlg()) {

			if (walletDTO.getUsed().equals("使用可")) {
				String used ="使用不可";

				chagewalletDAO.ManagerWalletChageUpdate(used,session.get("loginUserId").toString(),NetMoneyNumber);
				session.get("UserWallet");
				int UserWalet = Integer.parseInt(session.get("UserWallet").toString());
				int NetMoney = Integer.parseInt(walletDTO.getPrice());

				int totalUserWallet = UserWalet + NetMoney;

				chagewalletDAO.UserWalletChageUpdate(totalUserWallet, session.get("loginUserId").toString());

			}
		}

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
}
