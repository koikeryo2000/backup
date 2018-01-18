package action;

import java.sql.Blob;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String category;
	private String description;
	private Blob image;
	private String image2;

	public Map<String, Object> session;

	public String execute(){
		String result = SUCCESS;



		session.put("itemName", itemName);
		session.put("itemPrice", itemPrice);
		session.put("itemStock", itemStock);
		session.put("image", image);
		session.put("category", category);
		session.put("description", description);
		session.put("image2", image2);

		System.out.println("送られた画像の内容"+session.get("image"));

		System.out.println("送られた内容"+session.get("itemName"));

		System.out.println("画像URL" + session.get("image2"));

		return result;

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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
