package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {


	//フィールド ユーザー登録画面の値
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String year;
	private String streetAddress;
	private String sex;
	private String phoneNumber;
	public Map<String,Object> session;
	private String errorMassage;



	public String execute(){

		//System.out.println(loginUserId+"の中身");
		//System.out.println(year+"年齢の中身");
		//System.out.println(sex+"性別の中身");


		String result = SUCCESS;

		//&& !(loginPassword.equals("")) && !(userName.equals("")) &&
		//!(year.equals(year)) && (streetAddress.equals("")) && !(sex.equals(sex)) && !(phoneNumber.equals(""))

		if (!(loginUserId.equals(""))
		) {
			session.put(loginUserId, loginUserId);
			session.put(loginPassword,loginPassword );
			session.put(userName, userName );
			session.put(year, year );
			session.put(streetAddress, streetAddress );
			session.put(sex, sex);
			session.put(phoneNumber, phoneNumber);


		} else {
			System.out.println("エラーがでた");
			setErrorMassage("未入力の項目があります。");
			result=ERROR;
		}

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



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public String getErrorMassage() {
		return errorMassage;
	}



	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}