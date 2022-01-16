package learn_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://127.0.0.1:3306/employees_database";
		
		
		try {
			Connection con=DriverManager.getConnection(url,"root","admin");
			Statement stm=con.createStatement();
			stm.executeUpdate("update employees_tbl set name='sunil' where id=200");
			System.out.println("data is updated");
			
		} catch (SQLException e) {
			System.out.println("Error while updating....");
		}

	}

}
