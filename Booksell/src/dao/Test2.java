package dao;

import java.util.ArrayList;

import dto.ShoppingCartDTO;

public class Test2 {

	public static void main(String[] args) {

		ArrayList<ShoppingCartDTO> SpList = new ArrayList<ShoppingCartDTO>();

		 ShoppingCartDTO scDTO = new ShoppingCartDTO();

		 ShoppingCartDAO scdao = new ShoppingCartDAO();

		 String id ="koike";

		 //scDTO = scdao.gettotal(id);



		 System.out.println("数"+scDTO.getTotal());

		// System.out.println("数"+SpList.get(0));








	}

}
