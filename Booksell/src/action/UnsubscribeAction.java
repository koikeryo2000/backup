package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UnsubscribeDAO;

public class UnsubscribeAction extends ActionSupport implements SessionAware {

private UnsubscribeDAO unsubscribeDAO = new UnsubscribeDAO();

private String why;

private String why1;

private String why2;

private String why3;




private String total;

private String reason;

String a="";
String b="";
String c="";
String d="";


	public Map<String, Object> session;

	public String execute(){






		System.out.println("whyの値"+why);
		System.out.println("resonの値"+reason);

		System.out.println("MAPのログインユーザーID"+session.get("loginUserId"));

		if (why==null) {
			a="";
		}else {
			a=why;
		}
		if (why1==null) {
			b="";
		}else {
			b=why1;
		}
		if (why2==null) {
			c="";
		}else {
			c=why2;
		}
		if (why3==null) {
			why3="";
		}else {
			d=why3;
		}

		total=a+b+c+d;

		System.out.println("あわせたら"+total);
		System.out.println("aaaaaa");







			unsubscribeDAO.deleteUser(session.get("loginUserId").toString());




			unsubscribeDAO.Unsubscribe(session.get("loginUserId").toString(), total, reason);


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

	public String getWhy1() {
		return why1;
	}

	public void setWhy1(String why1) {
		this.why1 = why1;
	}

	public String getWhy2() {
		return why2;
	}

	public void setWhy2(String why2) {
		this.why2 = why2;
	}

	public String getWhy3() {
		return why3;
	}

	public void setWhy3(String why3) {
		this.why3 = why3;
	}








}
