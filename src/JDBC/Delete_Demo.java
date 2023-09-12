package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;  


class Delete_Demo{  
public static void main(String args[])throws Exception{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test","root","");     
	

PreparedStatement stmt=con.prepareStatement("delete from testing where id=?");  
stmt.setInt(1,9);  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records deleted");  
con.close();  
}}  