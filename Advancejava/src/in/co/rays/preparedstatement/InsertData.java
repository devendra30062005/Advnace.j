package in.co.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("insert into emp values(14,'jaya',50000,4)");
		
		int i = ps.executeUpdate();
		
		System.out.println("data insert"+i);
		
		
		
	}

}
