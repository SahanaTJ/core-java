package com.xworkz.nailpolish.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.jsp.tagext.TryCatchFinally;

public class JDBCRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate", "root",
					"Xworkzodc@123");
			String insertQuery = "insert into nailpolish values(0,'sana','sanabrand','pink',500,'high')";
			Statement statement = connObject.createStatement();
			int rowsAffected = statement.executeUpdate(insertQuery);
			System.out.println("rowsAffected" + rowsAffected);
			connObject.close();
		} catch (ClassNotFoundException event) {
			System.err.println("ClassNotFoundException problem loading driver, class name is wrong");

		} catch (SQLException e) {
			System.err.println("SQLException connecting to DB, either URl,UN or PWD is wrong");
			e.printStackTrace();
		}
	 try {
		
	} catch (ClassNotFoundException e) {
	  e.printStackTrace();
	}
}
}