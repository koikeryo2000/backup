package action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

import dao.ImageCreateDAO;

public class ImageAction extends ActionSupport {
private String name;
private File image;

ImageCreateDAO imageCreatedao = new ImageCreateDAO();






public String execute(){
	String result = ERROR;
	System.out.println("値チェック名前"+name);
	System.out.println("値チェック画像"+image);

	//imageCreatedao.createImage(name, image);

	result =SUCCESS;


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


public ImageCreateDAO getImageCreatedao() {
	return imageCreatedao;
}


public void setImageCreatedao(ImageCreateDAO imageCreatedao) {
	this.imageCreatedao = imageCreatedao;
}




}


