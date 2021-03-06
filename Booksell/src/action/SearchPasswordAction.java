package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.SearchPasswordDAO;
import dto.SearchPasswordDTO;

public class SearchPasswordAction extends ActionSupport implements SessionAware {


	private String loginUserId;
	private String userName;
	private String phoneNumber;
	private String mailAddress;

	public Map<String, Object> session;

	private SearchPasswordDAO searchpasswordDAO = new SearchPasswordDAO();

	public List<SearchPasswordDTO> searchDTOList = new ArrayList<SearchPasswordDTO>();

	public SearchPasswordDTO serchPasswordDTO = new SearchPasswordDTO();

	public String execute(){
		String result = ERROR;


		//パスワードを探す
		//searchDTOList = searchpasswordDAO.getPassword(loginUserId, userName, phoneNumber, mailAddress);

		serchPasswordDTO= searchpasswordDAO.getPassword(loginUserId, userName, phoneNumber, mailAddress);

		session.put("login_pass", serchPasswordDTO.getLoginpass());



		 {
			 if (serchPasswordDTO.getSearchFlg()) {
				 System.out.println("分岐成功");
				 result=SUCCESS;
			}
		}





		return result;

	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public SearchPasswordDAO getSearchpasswordDAO() {
		return searchpasswordDAO;
	}

	public void setSearchpasswordDAO(SearchPasswordDAO searchpasswordDAO) {
		this.searchpasswordDAO = searchpasswordDAO;
	}

	public List<SearchPasswordDTO> getSearchDTOList() {
		return searchDTOList;
	}

	public void setSearchDTOList(List<SearchPasswordDTO> searchDTOList) {
		this.searchDTOList = searchDTOList;
	}


}
