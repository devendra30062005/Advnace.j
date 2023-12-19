package in.co.rays.test;

import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser1 {
	

	
	public class TestUser {
		
		public void main(String[] args) throws Exception {
			testadd();
			
			
		
		}	
			
			private void testadd() throws Exception  {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			
			UserBean bean = new UserBean();
			bean.setId(1);
			bean.setFirst_name("Aman");
			bean.setLast_name("Ravat");
			bean.setLogin_id("Aman@gmail.com");
			bean.setPassword("123");
			bean.setDob(sdf.parse("2005-06-30"));
			bean.setAddress("indore");
			
			UserModel model = new UserModel();
			
			model.add(bean);
			
			
			
		}
		


	}


}
