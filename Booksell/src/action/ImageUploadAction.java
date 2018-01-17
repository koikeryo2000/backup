package action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

import dao.ImageCreateDAO;

public class ImageUploadAction extends ActionSupport {
	private String name;
	private File image;

	public String execute(){

		//System.out.println("nameの値"+name);
		//System.out.println("imageの値"+image);

		ImageCreateDAO imageCreatedao = new ImageCreateDAO();

		imageCreatedao.createImage(name, image);

		String result=ERROR;

		result=SUCCESS;
		return result;


	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}




}
