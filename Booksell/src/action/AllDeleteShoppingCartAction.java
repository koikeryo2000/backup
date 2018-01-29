package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.DeleteCartDAO;

public class AllDeleteShoppingCartAction extends ActionSupport implements SessionAware {

	DeleteCartDAO DCDAO = new DeleteCartDAO();

	public Map<String, Object> session;

	public String execute(){
		String result;
		result=SUCCESS;

		DCDAO.alldeleteCart(session.get("loginUserId").toString());

		System.out.println("Id"+session.get("loginUserId").toString());

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
