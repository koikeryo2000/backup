package nigen;

public class koike2 {

	public static void main(String[] args) {
		Peroson koike = new Peroson();

		koike.setName("小池");
		koike.setSeibetu("男");
		koike.setSyumi("game");
		koike.setTodouhuken("東京");

		System.out.println("名前は"+koike.getName()+"です性別は"+koike.getSeibetu()+"です趣味は"+koike.getSyumi()+"住んでる県は"+koike.getTodouhuken());

		koike.setSyumi("カラオケ");

		System.out.println("趣味を間違えました 本当は"+koike.getSyumi()+"です");
	}

}