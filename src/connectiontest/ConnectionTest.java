package connectiontest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author [Manolo Peng]
 * Sep 11, 2025
 */
public class ConnectionTest {

	/**
	 * @param args
	 * @throws SQLException
	 * @throws InterruptedException 
	 * @throws  
	 */
	public static void main(String[] args) throws SQLException, InterruptedException {
		//The direction of the database
		//JDBC stands for java database connectivity
		String dbURL = "jdbc:mysql://localhost:3306/test";
		
		String username = "jose";
		String password = "jose";
		//This class is used to manage different drivers for relational database
		DriverManager driverManager;
		//Creamos una conneccion con la base de datos MySQL
		Connection connection = 
				DriverManager.getConnection(dbURL, username, password);
		System.out.println(connection);
		/**
		 * Las connecciones con las bases de datos son objetos pesados, 
		 * el proceso de establecimiento de la conneccion consume 
		 * mucho recurso del ordenador ...
		 * Una prueba de cuántas connecciones se puenden establecer 
		 * con una base de datos
		 */
		Connection[] connections = new Connection[1000];
		for (int i = 0; i < connections.length; i++) {
			connections[i] = DriverManager.getConnection(dbURL, username, password);
		}
		
		//Thread.currentThread().wait(1232334);
	}
}
