package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserUpdateDAO;




public class UserUpdateAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	private String column;
	private String change;

	private UserUpdateDAO UserUpdatedao = new UserUpdateDAO();





	public String execute(){
		String result =SUCCESS;

		UserUpdatedao.UserUpdate(column, change, session.get("loginUserId").toString());

		System.out.println("loginIｄの値"+session.get("loginUserId"));
		System.out.println("カラムの値"+column);
		System.out.println("変更項目の値"+change);
		
		

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
}
