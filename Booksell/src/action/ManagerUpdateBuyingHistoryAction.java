package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.BuyingHistoryDAO;
import dto.BuyingHistoryDTO;


public class ManagerUpdateBuyingHistoryAction extends ActionSupport  {

	BuyingHistoryDAO bhDAO = new BuyingHistoryDAO();

	String situation ="未発送";

	public ArrayList<BuyingHistoryDTO> UserBuyList = new ArrayList<BuyingHistoryDTO>();

	public String execute(){

		String result;

		UserBuyList = bhDAO.ShowUserBuyingHistory(situation);


		result=SUCCESS;

		return result;

	}

	public ArrayList<BuyingHistoryDTO> getUserBuyList() {
		return UserBuyList;
	}

	public void setUserBuyList(ArrayList<BuyingHistoryDTO> userBuyList) {
		UserBuyList = userBuyList;
	}

}
