package com.loke;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLconnector {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String userName = "root";
		String Password = "@LVGlokesh1";
		Connection con = null;
		
		try {
			// loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("Driver loaded successfully!!");
		//Establishing connection
		con = DriverManager.getConnection(url, userName, Password);
		System.out.println("connection established successfully");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null) {
				con.close();
				}
			}
			catch ( SQLException e)
			{
				e.printStackTrace();
			}
		}
				
	}

}
