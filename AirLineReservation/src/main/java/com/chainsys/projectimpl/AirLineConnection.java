package com.chainsys.projectimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AirLineConnection {

		//JDBC Connection
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			getConnection();
		}
		
		public static Connection getConnection() throws ClassNotFoundException, SQLException {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			return con;
			
		}
	

}
