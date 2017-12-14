
public class ChkLoadJdbc {

	public static void main(String[] args) {

		String msg ="";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ドライバのロードに成功しました";
		} catch (Exception e) {
			msg="ドライバのロードに失敗しました";
		}
		System.out.println(msg);
	}

}
