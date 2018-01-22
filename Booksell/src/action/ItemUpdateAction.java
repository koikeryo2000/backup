package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemUpdateDAO;

public class ItemUpdateAction extends ActionSupport  {

	private String column;
	private String change;
	private String itemName;

	private ItemUpdateDAO itemUpdateDAO = new ItemUpdateDAO();


	public String execute(){
		String result = SUCCESS;

		itemUpdateDAO.ItemUpdate(column, change, itemName);

		System.out.println("カラム"+column);
		System.out.println("変更内容"+change);
		System.out.println("商品名"+ itemName);




		return result;
	}


	public String getColumn() {
		return column;
	}


	public void setColumn(String column) {
		this.column = column;
	}


	public String getChange() {
		return change;
	}


	public void setChange(String change) {
		this.change = change;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
