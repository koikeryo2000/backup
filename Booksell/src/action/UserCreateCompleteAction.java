package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	//フィールド
	private String loginUserId;
	private String loginUserPassword;
	private String userName;
	private String year;
	private String streetAddress;
	private String sex;
	private String phoneNumber;
	private String mailAddress;

	public Map<String,Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();





	public String execute() {



		System.out.println("DAOに渡される値チェック"+session.get("loginUserId"));
		System.out.println("DAOに渡される値チェック"+session.get("loginUserPassword"));
		System.out.println("DAOに渡される値チェック"+session.get("userName"));
		System.out.println("DAOに渡される値チェック"+session.get("year"));
		System.out.println("DAOに渡される値チェック"+session.get("streetAddress"));
		System.out.println("DAOに渡される値チェック"+session.get("sex"));
		System.out.println("DAOに渡される値チェック"+session.get("phoneNumber"));
		System.out.println("DAOに渡される値チェック"+session.get("mailAddress"));



				System.out.println("usercreateまで実行できてるかチェック");




		try {
			userCreateCompleteDAO.cerateUser(session.get("loginUserId").toString(),
					session.get("loginUserPassword").toString(),
					session.get("userName").toString(),
					session.get("year").toString(),
					session.get("streetAddress").toString(),
					session.get("sex").toString(),
					session.get("phoneNumber").toString(),
					session.get("mailAddress").toString());




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




	public UserCreateCompleteDAO getUserCreateCompleteDAO() {
		return userCreateCompleteDAO;
	}

	public void setUserCreateCompleteDAO(UserCreateCompleteDAO userCreateCompleteDAO) {
		this.userCreateCompleteDAO = userCreateCompleteDAO;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

}
