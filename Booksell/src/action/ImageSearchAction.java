package action;

import java.io.OutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.RetrieveIamgesDAO;
import dto.ImageDTO;





public class ImageSearchAction extends ActionSupport {
	private String name;

	RetrieveIamgesDAO imagedao = new RetrieveIamgesDAO();

	ResultSet rs = null;

	List<ImageDTO> dataList = null;

	ImageDTO dataBean = null;


 public	String execute(){

	 String result=ERROR;

	 HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();

		String id = request.getParameter("id");

		try {
			 dataList = new ArrayList<>();
			 rs = imagedao.getData();
			 if (rs !=null) {
				while(rs.next()){
					dataBean = new ImageDTO();
					dataBean.setId(rs.getInt("id"));
					dataBean.setName(rs.getString("name"));
					dataList.add(dataBean);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}



	 try {
		 rs = imagedao.getPhoto(id);

		 if (rs.next()) {
			Blob ph = rs.getBlob("image");
			byte data[] = ph.getBytes(1,(int) ph.length());
			OutputStream out = response.getOutputStream();

			out.write(data);
			out.flush();
			out.close();
		}

	} catch (Exception e) {
		e.printStackTrace();
	}




	 result = SUCCESS;
	return result;

 }


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public List<ImageDTO> getDataList() {
	return dataList;
}


public void setDataList(List<ImageDTO> dataList) {
	this.dataList = dataList;
}


public RetrieveIamgesDAO getImagedao() {
	return imagedao;
}


public void setImagedao(RetrieveIamgesDAO imagedao) {
	this.imagedao = imagedao;
}


public ResultSet getRs() {
	return rs;
}


public void setRs(ResultSet rs) {
	this.rs = rs;
}


public ImageDTO getDataBean() {
	return dataBean;
}


public void setDataBean(ImageDTO dataBean) {
	this.dataBean = dataBean;
}

}
