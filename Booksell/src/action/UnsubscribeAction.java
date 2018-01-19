package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UnsubscribeDAO;

public class UnsubscribeAction extends ActionSupport implements SessionAware {

private UnsubscribeDAO unsubscribeDAO = new UnsubscribeDAO();

private String why;

private String reason;






	public Map<String, Object> session;

	public String execute(){




		System.out.println("whyの値"+why);
		System.out.println("resonの値"+reason);

		System.out.println("MAPのログインユーザーID"+session.get("loginUserId"));







		try {
			unsubscribeDAO.deleteUser(session.get("loginUserId").toString());
		} catch (Exception e) {

		}


		try {
			unsubscribeDAO.Unsubscribe(session.get("loginUserId").toString(), why, reason);
		} catch (Exception e) {

		}

		String result =SUCCESS;




		return result;


	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getWhy() {
		return why;
	}

	public void setWhy(String why) {
		this.why = why;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}






}
