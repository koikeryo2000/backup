package nigen;

public class Koike {

	public static void main(String[] args) {

		//引数を使う
		Peroson koike = new Peroson("小池", "game", "男", "東京");

		System.out.println("私の名前は"+koike.getName()+"です"+"趣味は"+koike.getSyumi()
		+"で"+"住んでる県は"+koike.getTodouhuken()+"性別は"+koike.getSeibetu());

		koike.setSyumi("カラオケ");

		System.out.println("趣味を間違えました。本当は"+koike.getSyumi()+"です");
	}

	//引数を使わない

	Peroson koike2 = new Peroson();





}
