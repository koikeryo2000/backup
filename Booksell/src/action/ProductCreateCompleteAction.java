package action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductCreateDAO;

public class ProductCreateCompleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String category;
	private String description;
	private String image;

	public String execute(){
		String result = SUCCESS;

		ProductCreateDAO productCreateDAO = new ProductCreateDAO();

		productCreateDAO.createProduct(itemName, itemPrice, itemStock, image, category, description, session.get("login_user_id").toString());


		return result;

	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}