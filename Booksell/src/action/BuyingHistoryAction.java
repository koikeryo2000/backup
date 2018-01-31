package action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.BuyingHistoryDAO;
import dto.BuyingHistoryDTO;

public class BuyingHistoryAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	BuyingHistoryDAO bhDAO = new BuyingHistoryDAO();

	ArrayList<BuyingHistoryDTO> BuyHistoryList = new ArrayList<BuyingHistoryDTO>();




	public String execute(){
		String result;

		System.out.println("sessionの値"+session.get("loginUserId").toString());

		BuyHistoryList = bhDAO.ShowBuyingHistory(session.get("loginUserId").toString());



		result=SUCCESS;

		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public ArrayList<BuyingHistoryDTO> getBuyHistoryList() {
		return BuyHistoryList;
	}


	public void setBuyHistoryList(ArrayList<BuyingHistoryDTO> buyHistoryList) {
		BuyHistoryList = buyHistoryList;
	}
}