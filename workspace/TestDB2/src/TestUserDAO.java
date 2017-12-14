import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {

	String name ="";
	String password ="";

	//↓名前 パスワード検索↓
	public void select(String name,String password) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql="select * from test_table where user_name=? and  password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();

			if (rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	//↓全件表示↓
		public void selectAll() {
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();

			String sql ="select * from test_table";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("user_name"));
					System.out.println(rs.getString("password"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		//↓名前検索↓
		public void selectByname(String name) {
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();

			String sql ="select * from test_table where user_name=?";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ResultSet rs =ps.executeQuery();

				while(rs.next()) {
					System.out.println(rs.getString("user_name"));
					System.out.println(rs.getString("password"));
				}


			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//↓パスワード検索↓
			public void selectByPassword(String password) {
				DBConnector db = new DBConnector();
				Connection con = db.getConnection();

				String sql ="select * from test_table where password=?";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, password);
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getString("user_name"));
						System.out.println(rs.getString("password"));
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//アップデート
			public void updateUserNameByUserName(String oldName,String newName) {
				DBConnector db = new DBConnector();
				Connection con = db.getConnection();

				String sql ="update test_table set user_name=? where user_name=?";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, newName);
					ps.setString(2, oldName);

					//↓sqlのアップデート文を送る
					int i =ps.executeUpdate();

					if(i>0) {
						System.out.println(i +"件更新されました");
					}else {
						System.out.println("該当するデータはありませんでした");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch ( SQLException e) {
					e.printStackTrace();
				}
				}

			//テーブルに情報を追加する
			public void insert(int user_id,String name,String password) {
				DBConnector db = new DBConnector();
				Connection con = db.getConnection();

				String sql ="insert into test_table values(?,?,?)";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setInt(1, user_id);
					ps.setString(2, name);
					ps.setString(3, password);
					int i=ps.executeUpdate();
					if(i>0) {
						System.out.println(i + "件登録されました");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			//↓削除↓
			public void delete(String name) {
				DBConnector db = new DBConnector();
				Connection con = db.getConnection();

				String sql ="delete from test_table where user_name=?";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, name);
					int i=ps.executeUpdate();
					if (i>0) {
						System.out.println(i + "件削除されました");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}


		}



