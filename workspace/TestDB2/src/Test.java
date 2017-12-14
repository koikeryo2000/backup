
public class Test {

	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();

		//↓検索↓
		dao.select("taro", "123");

		System.out.println();

		//↓全件表示↓
		dao.selectAll();

		System.out.println();

		//↓名前から検索↓
		dao.selectByname("taro");

		System.out.println();
		//↓パスワードから検索↓
		dao.selectByPassword("456");

		System.out.println();

		//↓名前を更新する（アップデート）↓
		dao.updateUserNameByUserName("taro", "saburo");

		System.out.println();

		//↓テーブルに追加する↓
		dao.insert(4, "shiro", "012");

		System.out.println();

		//↓削除↓
		dao.delete("shiro");


	}



}