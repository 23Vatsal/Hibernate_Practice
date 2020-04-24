package com.luv2code.testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl="jdbc:mysql://localhost:3306/employee_tracker?useSSL=false&servertimezone=UTC";
		String user="employee";
		String pass="employee";
		try {
			System.out.println("Connecting to db..."+jdbcUrl);
			Connection myConn=DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Successful");
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}
