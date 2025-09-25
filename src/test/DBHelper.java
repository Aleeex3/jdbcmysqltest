package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	//The direction of the database
	//JDBC stands for java database connectivity
	private static String dbURL = "jdbc:mysql://localhost:3306/JDBC";
	private static String username = "root";
	private static String password = "admin";
	//This class is used to manage different drivers for relational database
	DriverManager driverManager;
	//Creamos una conneccion con la base de datos MySQL
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
}
	
}