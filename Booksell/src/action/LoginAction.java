package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * ログインID
	 */
	private String loginUserId;

	/**
	 * ログインパスワード
	 */
	private String loginPassword;

	/**
	 * ログイン情報を格納
	 */
	public Map<String, Object> session;

	/**
	 * ログイン情報取得DAO
	 */
	private LoginDAO loginDAO = new LoginDAO();

	/**
	 * ログイン情報格納IDTO
	 */
	private LoginDTO loginDTO = new LoginDTO();

	/**
	 * アイテム情報を取得
	 */


	/**
	 * 実行メソッド
	 */
	public String execute(){

		String result = ERROR;

		// ログイン実行
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);



		session.put("loginUser", loginDTO);
		session.put("loginUserId", loginDTO.getLoginId());
		session.put("UserWallet",loginDTO.getWallet());

		System.out.println("ログインした人の財布の中身"+loginDTO.getWallet());

		System.out.println("Mapの財布"+session.get("UserWallet"));

		System.out.println("loginDTOの中身"+loginDTO.getLoginId());
		System.out.println("MAPのログインユーザーID"+session.get("loginUserId"));

		// ログイン情報を比較
		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;
			//商品購入機能を作ったら商品購入履歴を作る
			//session.put("login_user_id", login)


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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
