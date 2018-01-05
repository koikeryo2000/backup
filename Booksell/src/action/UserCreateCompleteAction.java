package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	//フィールド
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String year;
	private String streetAddress;
	private String sex;
	private String Number;

	public Map<String,Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() {
				//System.out.println("usercreateまで実行できてるかチェック");
		try {
			userCreateCompleteDAO.cerateUser(session.get("loginUserId").toString(),
					session.get("loginPassword").toString(),
					session.get("userName").toString(),
					session.get("year").toString(),
					session.get("streetAddress").toString(),
					session.get("sex").toString(),
					session.get("Number").toString());

			System.out.println();


		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("ユーザー登録DBにエラーがでた");
		}
		String result = SUCCESS;
		return result;





	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
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

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public UserCreateCompleteDAO getUserCreateCompleteDAO() {
		return userCreateCompleteDAO;
	}

	public void setUserCreateCompleteDAO(UserCreateCompleteDAO userCreateCompleteDAO) {
		this.userCreateCompleteDAO = userCreateCompleteDAO;
	}

}
