package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ManagerLoginDAO;
import dto.ManagerLoginDTO;

public class ManagerLoginAction extends ActionSupport implements SessionAware {

	private String loginUserId;

	private String loginPassword;

	public Map<String, Object> session;

	private ManagerLoginDAO managerLoginDAO = new ManagerLoginDAO();

	private ManagerLoginDTO managerLoginDTO = new ManagerLoginDTO();

	public String execute(){

		String result =ERROR;

		managerLoginDTO = managerLoginDAO.getLoginManager(loginUserId, loginPassword);

		session.put("loginUser", managerLoginDTO);

		if (((ManagerLoginDTO)session.get("loginUser")).getLoginFlg()) {
			 result =SUCCESS;

			 System.out.println(managerLoginDTO.getPosition());

				if (managerLoginDTO.getPosition().equals("社長")) {
					result=SUCCESS;
				}
				if (managerLoginDTO.getPosition().equals("部長")) {
					result=SUCCESS;
				}
				if (managerLoginDTO.getPosition().equals("店長")) {
					result=SUCCESS;
				}
				if (managerLoginDTO.getPosition().equals("社員")) {
					result=SUCCESS;
				}
				if (managerLoginDTO.getPosition().equals("アルバイト")) {
					result=NONE;
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

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ManagerLoginDAO getManagerLoginDAO() {
		return managerLoginDAO;
	}

	public void setManagerLoginDAO(ManagerLoginDAO managerLoginDAO) {
		this.managerLoginDAO = managerLoginDAO;
	}

	public ManagerLoginDTO getManagerLoginDTO() {
		return managerLoginDTO;
	}

	public void setManagerLoginDTO(ManagerLoginDTO managerLoginDTO) {
		this.managerLoginDTO = managerLoginDTO;
	}
}
