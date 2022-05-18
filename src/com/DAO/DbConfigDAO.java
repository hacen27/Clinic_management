package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConfigDAO {
	
	private String url;
	private String username;
	private String password;
	
	private DbConfigDAO(String url, String username, String password) {
		
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public static DbConfigDAO getInstance() {
		DbConfigDAO instance=null;
		try {
			Properties properties=new Properties();
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("BdConfig.properties"));
			String driver=properties.getProperty("com.mysql.jdbc.Driver");
			String url=properties.getProperty("jdbc:mysql://localhost:3306/Clinic");
			String username=properties.getProperty("root");
			String password=properties.getProperty("Sara@awaNovota12");
			//connexion a bd:
			Class.forName(driver);
			instance=new DbConfigDAO(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return instance;
		
		
	}
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}
