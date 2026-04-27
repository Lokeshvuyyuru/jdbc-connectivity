package com.loke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingTableBook {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/libraries";
		String userName= "root";
		String password ="@LVGlokesh1";
		Connection con = null;
		Statement stmt = null;
		
		String query = "CREATE TABLE IF NOT EXISTS book (bid INT PRIMARY KEY, bname VARCHAR(100), bprice FLOAT)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		con = DriverManager.getConnection(url,userName,password);
		System.out.println("connection established");
		stmt = con.createStatement();
		System.out.println("table created successfully");
		stmt.close();
		con.close();
		
								
	}

}
