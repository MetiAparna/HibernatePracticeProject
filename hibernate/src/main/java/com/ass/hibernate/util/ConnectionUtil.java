package com.ass.hibernate.util;

import java.util.Properties;

public class ConnectionUtil {
	
	
	
	public static Properties getConnection() {
		
		
		Properties properties = new Properties();
		properties.setProperty("Connection.diver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate_db");
		properties.setProperty("hibernate.connection.user", "root");
		properties.setProperty("hibernate.connection.password", "password");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		
		properties.setProperty("hibernate.show_sql","true");
		
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		
		return properties;
       
		
		
	}

}
