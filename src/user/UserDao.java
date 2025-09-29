package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * data access object for user table
 *  PC-ProfesorCVE 25 sept 2025
 */
public class UserDao {
	public void insert(String name,String password,int id, boolean isVIP) {
	String insertSQL = "insert into users values ( "+"'?'," + "'?'," + "? "+"?)";
	Connection connection = DBHelper.getConnection();
	try {
		PreparedStatement ps = connection.prepareStatement(insertSQL);
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setInt(3, id);
		ps.setBoolean(4, isVIP);

		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
 