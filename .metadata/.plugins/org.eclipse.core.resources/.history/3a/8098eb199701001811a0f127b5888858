package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.SearchProductDAO;
import dao.ShowProductDAO;
import dto.ProductDTO;

public class ProductDetailAction extends ActionSupport {

	private String Name;

	ShowProductDAO showProductDAO = new ShowProductDAO();

	public ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	SearchProductDAO searchProductdao = new SearchProductDAO();


	public String execute(){
		String result;

		System.out.println("商品名が送られてるかチェック"+Name);

		productList = searchProductdao.searchProduct(Name);

		//Iterator<ProductDTO> iterator = productList.iterator();

		//if (!(iterator.hasNext())) {
			//productList = null;
		//}

		result =SUCCESS;

		return result;


	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}



}
