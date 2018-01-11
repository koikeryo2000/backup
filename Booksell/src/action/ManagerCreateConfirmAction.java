package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ManagerCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginUserPassword;
	private String userName;
	private String year;
	private String position;


	public Map<String, Object> session;

	public String execute(){

		String result =SUCCESS;

		session.put("loginUserId", loginUserId);
		session.put("loginUserPassword", loginUserPassword);
		session.put("userName", userName);
		session.put("year", year);
		session.put("position", position);

		return result;

	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginUserPassword() {
		return loginUserPassword;
	}

	public void setLoginUserPassword(String loginUserPassword) {
		this.loginUserPassword = loginUserPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
