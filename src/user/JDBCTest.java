package user;

import java.security.Identity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.crypto.spec.PSource.PSpecified;

public class JDBCTest {
	public static void main(String[]args) {
//		//The direction of the database
//				//JDBC stands for java database connectivity
//				String dbURL = "jdbc:mysql://localhost:3306/JDBC";
//				
//				String username = "root";
//				String password = "admin";
//				//This class is used to manage different drivers for relational database
//				DriverManager driverManager;
//				//Creamos una conneccion con la base de datos MySQL
				Connection connection = new DBHelper().getConnection();
				try {
//					connection = DriverManager.getConnection(dbURL, username, password);
//					// String dropSQL = "DROP TABLE users"; 
//					createUserTable();
					
					String createSQL = "create table if not exists users  ( "
					+ "name VARCHAR(255),"
					+ "password VARCHAR(255),"
					+"isVIP TINYINT(1),"
					+ "id integer not null"
							+ ")";
					String deleteSQL = "DELETE FROM users WHERE name =`alex´";
				//	ps = connection.prepareStatement(deleteSQL);
					String selectSQL = " select * from users where name ='alex'";
					PreparedStatement ps = connection.prepareStatement(selectSQL);
					ResultSet resultSet = ps.executeQuery();
					
					while (resultSet.next()) {
						int id = resultSet.getInt("id");
						String name = resultSet.getString("name");
						boolean isVip = resultSet.getBoolean("isVIP");
						System.out.println("record > id = " + id + "name = "+ name + "isVIP = "+ isVip );
					}
	
					PreparedStatement ps1 = connection.prepareStatement(createSQL);
					ps1.execute(); 
					String insertSQL = "insert into users values ( "+"'alex'," + "'admin'," + "1, "+"12)";
					ps1 = connection.prepareStatement(insertSQL);
					ps1.execute();
					// Sirve para borrar una linea de datos
					//String deleteSQL = "";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
}

	private static void createUserTable() {
		// TODO Auto-generated method stub
		
	}
}
