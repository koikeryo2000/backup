package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.NetMoneyCreateCompleteDAO;

public class NetMoneyCreateCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	String price;


	NetMoneyCreateCompleteDAO NetMoneyDAO = new NetMoneyCreateCompleteDAO();

	public String execute(){
		String result = SUCCESS;
		//String price ="1000";
		//String id ="aaaa";
		System.out.println("発行金額チェック"+session.get("price"));
		System.out.println("発行者チェック"+session.get("login_user_id"));

		String id =session.get("login_user_id").toString();








		//NetMoneyDAO.test(session.get("price").toString(), session.get("loginUserId").toString());
		NetMoneyDAO.CreateNetMoney(session.get("price").toString(),session.get("login_user_id").toString() );
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}