package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.SearchProductDAO;
import dto.ProductDTO;

public class SearchProductAction extends ActionSupport {

	private String column;

	private String change;

	SearchProductDAO searchProductDAO = new SearchProductDAO();

	public ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	public String execute(){
		String result;

		productList = searchProductDAO.ColumnSearchProductDAO(column, change);


		System.out.println("カラム値"+column);
		System.out.println("詳細値"+ change);

		result=SUCCESS;

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
}
