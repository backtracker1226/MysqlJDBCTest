package org.backtracker.web;

import java.sql.Connection;
import java.sql.DriverManager;



public class MysqlConnectionTest {
	
	// bad code Mysql connection test
	public static void main(String[] args)throws Exception {
		
		//Mysql 5.x 버전 : "com.mysql.jdbc.Driver"
		//Mysql 6.x 버전 : "com.mysql.cj.jdbc.Driver"
		
		String className="com.mysql.jdbc.Driver";
		
		String url="jdbc:mysql://localhost:3306/sample_db?useSSL=false";
		
		String user="bit92";
		
		String password="bit92";
		
		Class.forName(className);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println(con);
		
		con.close();
		
	}

}
