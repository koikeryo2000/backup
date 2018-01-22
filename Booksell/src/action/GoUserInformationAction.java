package action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ShowUserInformationDAO;
import dto.UserInformationDTO;

public class GoUserInformationAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public ArrayList<UserInformationDTO> userInfoList = new ArrayList<UserInformationDTO>();



	private UserInformationDTO userInformationDTO = new UserInformationDTO();

	private  ShowUserInformationDAO showUserInformationDAO = new ShowUserInformationDAO();

	public ArrayList<UserInformationDTO> UserInfoList = new ArrayList<UserInformationDTO>();

	public String execute(){
		String result = SUCCESS;

		UserInfoList = showUserInformationDAO.getUserInfo(session.get("loginUserId").toString());





		return result;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public UserInformationDTO getUserInformationDTO() {
		return userInformationDTO;
	}

	public void setUserInformationDTO(UserInformationDTO userInformationDTO) {
		this.userInformationDTO = userInformationDTO;
	}

	public ShowUserInformationDAO getShowUserInformationDAO() {
		return showUserInformationDAO;
	}

	public void setShowUserInformationDAO(ShowUserInformationDAO showUserInformationDAO) {
		this.showUserInformationDAO = showUserInformationDAO;
	}
}
