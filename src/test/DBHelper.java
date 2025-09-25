package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	//The direction of the database
	//JDBC stands for java database connectivity
	String dbURL = "jdbc:mysql://localhost:3306/JDBC";
	String username = "root";
	String password = "admin";
	//This class is used to manage different drivers for relational database
	DriverManager driverManager;
	//Creamos una conneccion con la base de datos MySQL
	public Connection getConnection(){
		try {
			return DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
}
	
}