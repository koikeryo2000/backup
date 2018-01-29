package action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.DeleteCartDAO;
import dao.ShoppingCartDAO;
import dto.ShoppingCartDTO;

public class DeleteCartAction extends ActionSupport implements SessionAware {

	private int id;

	public Map<String,Object> session;

	DeleteCartDAO deletecartDAO = new DeleteCartDAO();

	public ArrayList<ShoppingCartDTO> cartList = new ArrayList<ShoppingCartDTO>();

	public ArrayList<ShoppingCartDTO> ShoppingList = new ArrayList<ShoppingCartDTO>();

	public ArrayList<ShoppingCartDTO> SpList = new ArrayList<ShoppingCartDTO>();

	ShoppingCartDTO scDTO = new ShoppingCartDTO();

	ShoppingCartDAO scDAO = new ShoppingCartDAO();

	public String execute(){
		String result;

		deletecartDAO.deleteCart(id);

		cartList =scDAO.SearchShoppingCart(session.get("loginUserId").toString());

		scDTO = scDAO.gettotal(session.get("loginUserId").toString());

		session.put("Usertotal", scDTO.getTotal());


		result =SUCCESS;
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
