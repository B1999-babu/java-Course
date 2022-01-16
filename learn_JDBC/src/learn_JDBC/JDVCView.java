package learn_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDVCView {
	
	public static void main(String args[]) {
		String url="jdbc:mysql://127.0.0.1:3306/employees_database";
		
		try {
			Connection con=DriverManager.getConnection(url,"root","admin");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from employees_tbl");
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
