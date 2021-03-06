package dto;


	import java.sql.Blob;
import java.util.Date;

	public class ItemDTO {

		private int id;
		private String itemName;
		private int itemPrice;
		private int itemStock;
		private String category;
		private String description;
		private Blob image;
		private Date insertdate;
		private String login_user_id;

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
		public Blob getImage() {
			return image;
		}
		public void setImage(Blob image) {
			this.image = image;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Date getInsertdate() {
			return insertdate;
		}
		public void setInsertdate(Date insertdate) {
			this.insertdate = insertdate;
		}
		public String getLogin_user_id() {
			return login_user_id;
		}
		public void setLogin_user_id(String login_user_id) {
			this.login_user_id = login_user_id;
		}

	}

