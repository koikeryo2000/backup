package action;

import java.sql.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoUserReviwAction extends ActionSupport implements SessionAware{

	private String itemName;
	private String situation;
	private Date BuyDate;



	public Map<String, Object> session;

	public String result(){

		String result =ERROR;

		session.put("ReviwitemName", itemName);
		session.put("situation", situation);

		System.out.println("チェック"+situation);

		if (situation.equals("受け取り済み")) {




			//result =SUCCESS;


		}



		return result;

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public Date getBuyDate() {
		return BuyDate;
	}

	public void setBuyDate(Date buyDate) {
		BuyDate = buyDate;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}






}
