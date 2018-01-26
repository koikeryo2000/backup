package action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ShoppingCartDAO;
import dto.ShoppingCartDTO;

public class ShoppingCartAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private String image;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private int total;
	private int Stock;

	ShoppingCartDTO scDTO = new ShoppingCartDTO();


	ShoppingCartDAO scDAO = new ShoppingCartDAO();

	public ArrayList<ShoppingCartDTO> cartList = new ArrayList<ShoppingCartDTO>();

	public ArrayList<ShoppingCartDTO> ShoppingList = new ArrayList<ShoppingCartDTO>();

	public ArrayList<ShoppingCartDTO> SpList = new ArrayList<ShoppingCartDTO>();

	int a;

	public String execute(){
		String result;

		System.out.println("値渡されてるかチェック"+ image);
		System.out.println("値渡されてるかチェック"+ itemName);
		System.out.println("値渡されてるかチェック"+ itemPrice);
		System.out.println("値渡されてるかチェック"+ itemStock);
		System.out.println("値渡されてるかチェック"+ Stock);
		System.out.println("値渡されてるかチェック"+ session.get("loginUserId").toString());

		//scDAO.createShoppingCart(itemName, itemPrice, itemStock, image, session.get("login_user_id").toString());

		total =(itemPrice*Stock);

		System.out.println("値段×個数"+total);

		scDAO.cerateCart(itemName, itemPrice, Stock, total, image, session.get("loginUserId").toString());

		cartList = scDAO.SearchShoppingCart(session.get("loginUserId").toString());



		//String a ="koike";

		System.out.println("sessionget"+session.get("loginUserId").toString());

		scDTO = scDAO.gettotal(session.get("loginUserId").toString());

		System.out.println("totalは"+scDTO.getTotal());

		session.put("Usertotal", scDTO.getTotal());

		//System.out.println("action合計"+scDTO.getTotal());

		//int b =scDTO.getTotal();

		//ArrayList<ShoppingCartDTO> spList = new ArrayList<ShoppingCartDTO>();

		//spList.add(scDTO);



		//System.out.println("ShoppingListのtotalの値"+ShoppingList);






		result= SUCCESS;




		return result;


	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}


}
