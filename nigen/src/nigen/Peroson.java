package nigen;

public class Peroson {

	private String name=null;
	private String syumi=null;
	private String seibetu=null;
	private String todouhuken=null;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSyumi() {
		return syumi;
	}
	public void setSyumi(String syumi) {
		this.syumi = syumi;
	}
	public String getSeibetu() {
		return seibetu;
	}
	public void setSeibetu(String seibetu) {
		this.seibetu = seibetu;
	}
	public String getTodouhuken() {
		return todouhuken;
	}
	public void setTodouhuken(String todouhuken) {
		this.todouhuken = todouhuken;
	}


	public Peroson(String name, String syumi, String seibetu, String todouhuken) {

		this.name = name;
		this.syumi = syumi;
		this.seibetu = seibetu;
		this.todouhuken = todouhuken;

	}
	public Peroson() {
		super();
	}

}
