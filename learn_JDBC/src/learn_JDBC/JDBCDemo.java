package learn_JDBC;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://127.0.0.1:3306/employees_database";
		
		int rowsAffected;
		try {
			
			Connection con=DriverManager.getConnection(url,"root","admin");
	        Statement stm=con.createStatement();
	        rowsAffected= stm.executeUpdate("insert into employees_tbl values(550,'baburao','employee',4000)");
		
		    
		    
		    System.out.println("data is inserted - rowsAffected  "+rowsAffected);
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println("Error while insertion");
		}

	}



}
