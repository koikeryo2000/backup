package dao;



public class Test3 {

	public static void main(String[] args) {
		BuyItemUserDAO biuDAO = new BuyItemUserDAO();

		int productId =1;
		String Name ="酒";
		int price =100;
		int total_price =100;
		int stock =1;
		int user_total_price=100;
		String pay ="NetMoney";
		String image ="a;skfa;sdafjpg";
		String loginId="koike";
		String situation ="未発送";

		biuDAO.CreateProductUser(productId, Name, price, total_price, stock, user_total_price, pay, image, situation, loginId);




		//dao.createShoppingCart(itemName, itemprice, itemstock, image, userId);

	}

}
