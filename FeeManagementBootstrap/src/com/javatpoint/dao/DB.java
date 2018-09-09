package com.javatpoint.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		//Class.forName("org.mariadb.jdbc.Driver");
		//conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db", USER, PASS);
		Class.forName("org.mariadb.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/db","root","dbs123");
	}catch(Exception ex){
		System.out.println(ex);}
	return con;
}
}
