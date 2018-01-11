package dto;

public class SearchPasswordDTO {
	private String loginpass;

	private boolean searchFlg = false;

	public String getLoginpass() {
		return loginpass;
	}

	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}

	public boolean getSearchFlg() {
		return searchFlg;
	}

	public void setSearchFlg(boolean searchFlg) {
		this.searchFlg = searchFlg;
	}


}


