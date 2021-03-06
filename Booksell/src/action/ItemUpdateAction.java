package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemUpdateDAO;

public class ItemUpdateAction extends ActionSupport implements SessionAware  {

	private String column;
	private String change;
	private String itemName;

	public Map<String, Object> session;

	private ItemUpdateDAO itemUpdateDAO = new ItemUpdateDAO();


	public String execute(){
		String result = SUCCESS;

		itemUpdateDAO.ItemUpdate(column, change, itemName, session.get("login_user_id").toString());

		System.out.println("カラム"+column);
		System.out.println("変更内容"+change);
		System.out.println("商品名"+ itemName);

		System.out.println("sessionのユーザーID"+session.get("login_user_id"));




		return result;
	}


	public String getColumn() {
		return column;
	}


	public void setColumn(String column) {
		this.column = column;
	}


	public String getChange() {
		return change;
	}


	public void setChange(String change) {
		this.change = change;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
