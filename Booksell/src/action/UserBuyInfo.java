package action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserBuyInfoDAO;
import dto.BuyDTO;

public class UserBuyInfo extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	ArrayList<BuyDTO> buyList = new ArrayList<BuyDTO>();

	UserBuyInfoDAO ubiDAO = new UserBuyInfoDAO();

	public String execute(){
		 String result;

		buyList= ubiDAO.ShowUserBuyInfo(session.get("loginUserId").toString());



			result = SUCCESS;

			return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
