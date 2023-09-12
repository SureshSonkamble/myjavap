package JDBC;

import java.sql.*;  
class InsertPrepared_demo{  
public static void main(String args[]){  
	
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test","root","");  
//PreparedStatement stmt=con.prepareStatement("insert into testing values(?,?,?,?)");  
PreparedStatement stmt=con.prepareStatement("insert into testing(name,addr,email) values(?,?,?)"); 
//stmt.setInt(1,4);//1 specifies the first parameter in the query  
stmt.setString(1,"Suresh");  
stmt.setString(2,"Nashik");  
stmt.setString(3,"suresh@gmail.com");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
 
}catch(Exception e){ System.out.println(e);}  
  
}  
}  