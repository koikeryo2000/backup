package dao;



public class Test3 {

	public static void main(String[] args) {
		ProductUpdateDAO biuDAO = new ProductUpdateDAO();

		//int productId =1;
		//String Name ="酒";
		//int price =100;
		//int total_price =100;
		//int stock =1;
		//int user_total_price=100;
		String column ="item_name";
		String change ="酒";
		String itemName="高尾日本酒";
		String id ="テスト";

		biuDAO.ProductUpdate(column, change, itemName, id);




		//dao.createShoppingCart(itemName, itemprice, itemstock, image, userId);

	}

}
