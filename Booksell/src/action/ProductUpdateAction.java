package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductUpdateDAO;

public class ProductUpdateAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String column;
	private String change;
	private String itemName;

	private ProductUpdateDAO productUpdatedao = new ProductUpdateDAO();



	public String execute(){
		String result =SUCCESS;

		productUpdatedao.ProductUpdate(column, change, itemName, session.get("login_user_id").toString());

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

}
