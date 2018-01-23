package dto;

public class WalletDTO {

	private String NetMoneyCode;

	private String used;

	private String price;

	private String UserWallet;

	private boolean Flg = false;
	public String getNetMoneyCode() {
		return NetMoneyCode;
	}

	public void setNetMoneyCode(String netMoneyCode) {
		NetMoneyCode = netMoneyCode;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean getFlg() {
		return Flg;
	}

	public void setFlg(boolean flg) {
		Flg = flg;
	}

	public String getUserWallet() {
		return UserWallet;
	}

	public void setUserWallet(String userWallet) {
		UserWallet = userWallet;
	}
}
