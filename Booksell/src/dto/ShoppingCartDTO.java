package dto;

import java.util.Date;

public class ShoppingCartDTO {



	private String itemName;
	private int price;
	private int stock;
	private String image;
	private int total;
	private String UserId;
	private Date insertdate;
	private int id;
	private int Producttotal;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Date getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProducttotal() {
		return Producttotal;
	}
	public void setProducttotal(int producttotal) {
		Producttotal = producttotal;
	}

}
