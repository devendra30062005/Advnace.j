package in.co.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class TestUser {
	
	public static void main(String[] args) throws Exception {
		testadd();
		
		
	
	}	
		
		private static void testadd() throws Exception  {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		UserBean bean = new UserBean();
		bean.setId(1);
		bean.setFirstName("Aman");
		bean.setLastName("Ravat");
		bean.setLoginId("Aman@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2005-06-30"));
		bean.setAddress("indore");
		
		UserModel model = new UserModel();
		
		model.add(bean);
		
		
		
	}
	


}
