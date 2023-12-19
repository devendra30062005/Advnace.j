package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		
		Statement st =con.createStatement ();
		
		int i =st.executeUpdate("insert into emp values (11,'aditi',25000,3)");
		
		System.out.println("insert data "+i);
		
		
		
	}

}
