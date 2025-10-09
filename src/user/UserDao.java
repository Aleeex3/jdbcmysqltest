package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * data access object for user table PC-ProfesorCVE 25 sept 2025
 */
public class UserDao {
	public void insert(String name, String password, int id, boolean isVIP) {
		String insertSQL = "insert into users values ( " + "'?'," + "'?'," + "? " + "?)";
		Connection connection = DBHelper.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(insertSQL);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setInt(3, id);
			ps.setBoolean(4, isVIP);

			int result = ps.executeUpdate();
			System.out.println("insert rows" + result);	
			connection.close();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	public void delete(long id) {
		String deleteSQL = "DELETE FROM users WHERE id =`12´";

	
		
	}
	
	public void update (int id, String email) {
		
	}
	public void findAll() {
		String selectSQL = " select * from users where name ='alex'";
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(selectSQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet resultSet = null;
		try {
			resultSet = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				boolean isVip = resultSet.getBoolean("isVIP");
				System.out.println("record > id = " + id + "name = "+ name + "isVIP = "+ isVip);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	
	public void insert(int i, Object object, int j, Object object2, Object object3, boolean b) {
		// TODO Auto-generated method stub
		
	}
}
