package com.loke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class AccessingColumnNumber {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/libraries";
		String username = "root";
		String password = "@LVGlokesh1";
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		String query = "select * from book";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		con = DriverManager.getConnection(url,username,password);
		System.out.println("connection established");
		//creating statement object
		stmt = con.createStatement();
		//Execute querry
		res = stmt.executeQuery(query);
		//processing query result
		System.out.println("\n Fetching Books details pls wait..");
		Thread.sleep(3000);
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+ res.getString(2)+" "+res.getFloat(3));
			
			Thread.sleep(2000);
			System.out.println();
		}
		//closing Resources
		res.close();
		stmt.close();
		con.close();
		
	}

}
