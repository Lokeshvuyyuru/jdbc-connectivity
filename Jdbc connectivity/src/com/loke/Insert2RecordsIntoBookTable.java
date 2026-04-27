package com.loke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert2RecordsIntoBookTable {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/libraries";
		String userName= "root";
		String password ="@LVGlokesh1";
		Connection con = null;
		Statement stmt = null;
		
		String query1 = "INSERT INTO book VALUES(3,'Python',450)";
		String query2 = "INSERT INTO book VALUES(4,'Hibernate',600)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		con = DriverManager.getConnection(url,userName,password);
		System.out.println("connection established");
		stmt = con.createStatement();
		System.out.println("table created successfully");
		stmt.executeUpdate(query1);
		stmt.executeUpdate(query2);
		stmt.close();
		con.close();

	}

}
