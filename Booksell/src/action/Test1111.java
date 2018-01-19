package action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Test1111 extends ActionSupport {
	private static final long serialVersionUID = -7116807617477612442L;
	private File img;
	private String imgContentType;
	private String imgFileName;

	@Override
	public String execute() throws Exception {

		try {
			// get the context path to save the file
			String path = ServletActionContext.getServletContext().getRealPath("/");
			System.out.println("Image Location:" + path);

			// handling the file
			File file = new File(path, imgFileName);
			FileUtils.copyFile(img, file);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public String getImgContentType() {
		return imgContentType;
	}

	public void setImgContentType(String imgContentType) {
		this.imgContentType = imgContentType;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}
}