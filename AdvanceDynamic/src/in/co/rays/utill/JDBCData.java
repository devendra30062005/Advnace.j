package in.co.rays.utill;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCData {



 
	
	private static JDBCData jds = null;
	
	private ComboPooledDataSource ds = null;
	
	
	
	
	private JDBCData() {
		 ResourceBundle rb =  ResourceBundle.getBundle("in.co.rays.bundle.system");


	try {

	ds = new ComboPooledDataSource();

	ds.setDriverClass(rb.getString("driver")); 

	ds.setJdbcUrl(rb.getString("url"));

	ds.setUser(rb.getString("name"));

	ds.setPassword(rb.getString("pass"));

	ds.setInitialPoolSize (Integer.parseInt(rb.getString("initial")));

	ds.setAcquireIncrement (Integer.parseInt(rb.getString("acquire")));

	ds.setMaxPoolSize (Integer.parseInt(rb.getString("max")));

	} catch (PropertyVetoException e) {

	e.printStackTrace();
	}
	}
	
	public static JDBCData  getInstance() {

	if (jds == null) {

	jds = new JDBCData(); 
	
	}

	return jds;

	}
	public static Connection getConnection() {

	try {
		return getInstance().ds.getConnection();
		
		}catch (SQLException e) {
	return null;
	}
	}
}
