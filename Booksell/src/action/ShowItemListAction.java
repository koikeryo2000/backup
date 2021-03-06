package action;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.ShowItemListDAO;
import dto.ItemDTO;

public class ShowItemListAction extends ActionSupport  {

	List<ItemDTO> itemList = null;

	ShowItemListDAO showItemListDAO = new ShowItemListDAO();

	ItemDTO itemDTO = null;

	ResultSet rs = null;

	public String execute(){

		String result =SUCCESS;

		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();

		String id = request.getParameter("id");

		try {
			itemList = new ArrayList<>();
			rs = showItemListDAO.showItem();
			if (rs !=null) {
				while (rs.next()) {
					itemDTO = new ItemDTO();
					itemDTO.setId(rs.getInt("id"));
					itemDTO.setItemName(rs.getString("item_name"));
					itemDTO.setItemPrice(rs.getInt("item_price"));
					itemDTO.setItemStock(rs.getInt("item_stock"));
					itemDTO.setCategory(rs.getString("Category"));
					itemDTO.setDescription(rs.getString("Description"));
					itemDTO.setLogin_user_id(rs.getString("user_master_id"));
					itemDTO.setInsertdate(rs.getDate("insert_date"));

					itemList.add(itemDTO);

				}
				System.out.println("アイテムの名前"+itemDTO.getItemName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("idの値"+id);
			rs = showItemListDAO.getPhoto(id);

			if (rs.next()) {
				Blob ph = rs.getBlob("image");
				byte data[] = ph.getBytes(1,(int) ph.length());
				OutputStream out = response.getOutputStream();
				out.write(data);
				out.flush();
				out.close();
			}






		} catch (IOException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}



		System.out.println("resultの値"+result);

		 result=SUCCESS;



		return result;

	}

	public List<ItemDTO> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemDTO> itemList) {
		this.itemList = itemList;
	}

	public ShowItemListDAO getShowItemListDAO() {
		return showItemListDAO;
	}

	public void setShowItemListDAO(ShowItemListDAO showItemListDAO) {
		this.showItemListDAO = showItemListDAO;
	}

	public ItemDTO getItemDTO() {
		return itemDTO;
	}

	public void setItemDTO(ItemDTO itemDTO) {
		this.itemDTO = itemDTO;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

}
