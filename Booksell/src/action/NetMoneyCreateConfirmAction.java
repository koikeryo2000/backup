package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class NetMoneyCreateConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	private int price;

	public String execute(){
		String result = SUCCESS;

		session.put("price", price);



		return result;
	}



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}







}
