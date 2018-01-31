package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.ShowProductDAO;
import dto.ProductDTO;

public class GoProductUpdateAction extends ActionSupport {

	ShowProductDAO shDAO = new ShowProductDAO();

	ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	public String execute(){
		String result;

		result = SUCCESS;



		productList = shDAO.ShowProduct();

		return result;

	}

	public ArrayList<ProductDTO> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<ProductDTO> productList) {
		this.productList = productList;
	}


}
