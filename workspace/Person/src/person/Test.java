package person;

public class Test {

	public static void main(String[] args) {
		Peroson taro = new Peroson();

		taro.name="taro";
		taro.age=18;

		System.out.println(taro.name);
		System.out.println(taro.age);

		Peroson jiro = new Peroson("jiro",20);
		System.out.println(jiro.name);
		System.out.println((jiro.age));


		System.out.println();
		Peroson saburo = new Peroson("saburo");
		System.out.println(saburo.name+" "+saburo.age);

		System.out.println();
		Peroson nanasi = new Peroson(25);
		System.out.println("名前："+nanasi.name+"年齢:"+nanasi.age);

		System.out.println();
		Peroson hanako = new Peroson("hanako",17);
		System.out.println("名前:"+hanako.name+"年齢:"+hanako.age);
	}

}
