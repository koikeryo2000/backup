package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ChangeSituationDAO;

public class ChangeSituationAction extends ActionSupport {

	private String situation;
	private int id;

	ChangeSituationDAO csDAO = new ChangeSituationDAO();

	public String execute(){
		String result;

		csDAO.ChangeSituation(situation, id);

		result=SUCCESS;

		return result;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
