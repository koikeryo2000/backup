package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ManagerCreateCompleteDAO;

public class ManagerCreateCompleteAction extends ActionSupport implements SessionAware {


	private String loginUserId;
	private String loginUserPassword;
	private String userName;
	private String year;
	private String position;

	public Map<String, Object> session;




	private ManagerCreateCompleteDAO managerCreateCompleteDAO = new ManagerCreateCompleteDAO();


public String execute(){
	String result=SUCCESS;



		managerCreateCompleteDAO.createManager(session.get("loginUserId").toString(),
				session.get("loginUserPassword").toString(),
				session.get("userName").toString(),
				session.get("year").toString(),
				session.get("position").toString(),
		session.get("login_user_id").toString());

		System.out.println("DAOに渡される値チェック"+session.get("loginUserId"));
		System.out.println("DAOに渡される値チェック"+session.get("loginUserPassword"));
		System.out.println("DAOに渡される値チェック"+session.get("userName"));
		System.out.println("DAOに渡される値チェック"+session.get("year"));
		System.out.println("DAOに渡される値チェック"+session.get("position"));
		System.out.println("DAOに渡される値チェック"+session.get("login_user_id"));


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


public ManagerCreateCompleteDAO getManagerCreateCompleteDAO() {
	return managerCreateCompleteDAO;
}


public void setManagerCreateCompleteDAO(ManagerCreateCompleteDAO managerCreateCompleteDAO) {
	this.managerCreateCompleteDAO = managerCreateCompleteDAO;
}
}
