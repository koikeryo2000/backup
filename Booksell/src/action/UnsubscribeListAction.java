package action;

import java.util.ArrayList;
import java.util.Iterator;

import com.opensymphony.xwork2.ActionSupport;

import dao.UnsubscribeListDAO;
import dto.UnsubscribeDTO;

public class UnsubscribeListAction extends ActionSupport {

	UnsubscribeDTO unsubscribeDTO = new UnsubscribeDTO();

	UnsubscribeListDAO unsubscribeListDAO = new UnsubscribeListDAO();



	public ArrayList<UnsubscribeDTO> unsubscribeList = new ArrayList<UnsubscribeDTO>();

	public String execute(){
		String result;
		result=SUCCESS;

		unsubscribeList = new ArrayList<>();

		unsubscribeList = unsubscribeListDAO.showUnsubscribe();

		Iterator<UnsubscribeDTO> iterator = unsubscribeList.iterator();
		if (!(iterator.hasNext())) {
			unsubscribeList = null;
		}




		return result;

	}

	public UnsubscribeDTO getUnsubscribeDTO() {
		return unsubscribeDTO;
	}

	public void setUnsubscribeDTO(UnsubscribeDTO unsubscribeDTO) {
		this.unsubscribeDTO = unsubscribeDTO;
	}



}
