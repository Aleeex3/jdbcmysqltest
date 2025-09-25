package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * data access object for user table
 *  PC-ProfesorCVE 25 sept 2025
 */
public class UserDao {
	public void insert(int id, String name, boolean isVIP) {
	String insertSQL = "insert into users values ( "+"'alex'," + "'admin'," + "1, "+"12)";
	Connection connection = DBHelper.getConnection();
	try {
		PreparedStatement ps = connection.prepareStatement(insertSQL);
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
 