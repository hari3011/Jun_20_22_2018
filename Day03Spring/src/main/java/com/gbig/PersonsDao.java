package com.gbig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonsDao {
	public void insert(String firstName,String lastName,int age) throws SQLException{
		String sql = "insert into persons(first_name,last_name,age) "
				+ "values('" + firstName + "','" + lastName + "'," + age + ")";
		Connection connection = null;
		try {
			
			//com.microsoft.jdbc.sqlserver.SQLServerDriver
			Class.forName("com.mysql.jdbc.Driver");
			
			//jdbc:sqlserver://localhost;databaseName=training;integratedSecurity=true;
			String url = "jdbc:mysql://localhost/training";
			String userName = "root";
			String password = "durasoft";
			connection =  DriverManager.getConnection(url,userName,password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			statement.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
	}
}
