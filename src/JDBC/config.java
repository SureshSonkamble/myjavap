package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;


public class config {

	Connection con;
	public void db_connect()
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test","root","");    
		
		}catch(Exception e){ System.out.println(e);}  
		}  
}
