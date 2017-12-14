package person;

public class Peroson {

	public String name=null;
	public int age =0;

	public Peroson(){}

	public  Peroson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Peroson(String name) {

		this.name = name;
		this.age =0;

	}public Peroson(int age){
		this.name="名前なし";
		this.age=age;
	}public Peroson(int age,String name){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

