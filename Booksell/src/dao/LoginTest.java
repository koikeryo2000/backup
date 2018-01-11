package dao;

public class LoginTest {

	public static void main(String[] args) {
		LoginDAO logindao = new LoginDAO();

		String loginUserId;
		String loginPassword;

		loginUserId="koikeryo";
		loginPassword="1111";

		logindao.getLoginUserInfo(loginUserId, loginPassword);

	}

}
