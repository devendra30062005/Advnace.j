package in.co.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserModel {
	
	public static  void add(UserBean bean) throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		
			PreparedStatement ps = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ? ,?)");
			
			ps.setInt(1,bean.getId());
			ps.setString(2,bean.getFirstName());
			ps.setString(3,bean.getLastName());
			ps.setString(4,bean.getLoginId());
			ps.setString(5,bean .getPassword());
			ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
			ps.setString(7,bean .getAddress());
			
			
			
			int i = ps.executeUpdate();
			
					System.out.println("Data inserted = " + i);
			
		

}

}

   
	
	
	
