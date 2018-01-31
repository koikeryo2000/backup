package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.ShowProductDAO;
import dto.ProductDTO;

public class GoShoppingAction extends ActionSupport {

	ShowProductDAO showProductDAO = new ShowProductDAO();

	public ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	public String execute(){
		String result;

		productList = showProductDAO.ShowProduct();

		result = SUCCESS;

		return result;

	}

}
