package learn_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {

	public static void main(String[] args) {
		String url="jdbc:mysql://127.0.0.1:3306/employees_database";
		
		try {
			Connection con=DriverManager.getConnection(url,"root","admin");
			Statement stm=con.createStatement();
			stm.executeUpdate("delete from employees_tbl where id=100");
			
			System.out.println("data is deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       

	}

}
