package in.co.rays.Testbundle;

import java.util.ResourceBundle;

public class TestSouceBundle {
	
	public static void main(String[] args) {
		
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.appp_hi");
		System.out.println(rs.getString("greetingss"));
		
	}

}
